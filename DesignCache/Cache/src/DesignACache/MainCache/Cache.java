package DesignACache.MainCache;

import DesignACache.EvictionAlgorithms.EvictionAlgorithm;
import DesignACache.Executors.KeyBasedExecutor;
import DesignACache.StorageMechanisms.Interfaces.CacheStorage;
import DesignACache.StorageMechanisms.Interfaces.DBStorage;
import DesignACache.WritePolicies.WritePolicy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class Cache <K,V>{
    private final CacheStorage<K,V> cacheStorage;
    private final DBStorage<K,V> dbStorage;
    private final WritePolicy<K,V> writePolicy;
    private final EvictionAlgorithm<K> evictionAlgorithm;
    private final KeyBasedExecutor keyBasedExecutor;

    public Cache(CacheStorage<K,V> cacheStorage,DBStorage<K,V> dbStorage,WritePolicy<K,V> writePolicy, EvictionAlgorithm<K> evictionAlgorithm,int numExecutors){
        this.cacheStorage=cacheStorage;
        this.dbStorage=dbStorage;
        this.evictionAlgorithm=evictionAlgorithm;
        this.writePolicy=writePolicy;
        keyBasedExecutor= new KeyBasedExecutor(numExecutors);
    }

    public CompletableFuture<V> accessData(K key){
        return keyBasedExecutor.submitTask(key,()->{
           try{
                if(!cacheStorage.containsKey(key)){
                    throw new Exception("Key not found in cache: "+key);
                }
                evictionAlgorithm.keyAccessed(key);
                return cacheStorage.get(key);
           } catch (Exception e){
               throw new CompletionException(e);
           }
        });
    }

    public CompletableFuture<Void> updateData(K key, V value) {
        return keyBasedExecutor.submitTask(key, () -> {
            try {
                if (cacheStorage.containsKey(key)) {
                    // Update case: perform concurrent write.
                    writePolicy.write(key, value, cacheStorage, dbStorage);
                    evictionAlgorithm.keyAccessed(key);
                } else {
                    // New key: If the cache is full, evict one key.
                    if (cacheStorage.size() >= cacheStorage.getCapcity()) {
                        K evictedKey = evictionAlgorithm.evictKey();
                        if (evictedKey != null) {
                            // Removal on the evicted key's executor to maintain ordering.
                            int currentIndex = keyBasedExecutor.getExecutorIndexForKey(key);
                            int evictedIndex = keyBasedExecutor.getExecutorIndexForKey(evictedKey);
                            if (currentIndex == evictedIndex) {
                                cacheStorage.remove(evictedKey);
                            } else {
                                CompletableFuture<Void> removalFuture = keyBasedExecutor.submitTask(evictedKey, () -> {
                                    try {
                                        cacheStorage.remove(evictedKey);
                                        return null;
                                    } catch (Exception ex) {
                                        throw new CompletionException(ex);
                                    }
                                });
                                removalFuture.join();
                            }
                        }
                    }
                    // Write the new key/value concurrently to both storages.
                    writePolicy.write(key, value, cacheStorage, dbStorage);
                    evictionAlgorithm.keyAccessed(key);
                }
                return null;
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        });
    }
    public void shutDown(){
        keyBasedExecutor.shutdown();
    }
}
