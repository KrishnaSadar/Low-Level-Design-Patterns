package DesignACache.WritePolicies.ConcreteWritePolicies;

import DesignACache.StorageMechanisms.Interfaces.CacheStorage;
import DesignACache.StorageMechanisms.Interfaces.DBStorage;
import DesignACache.WritePolicies.WritePolicy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class WriteThroghPolicy<K,V> implements WritePolicy<K,V> {

    @Override
    public void write(K key, V value, CacheStorage<K,V>cacheStorage, DBStorage<K,V>dbStorage) throws Exception{
        CompletableFuture<Void> cacheFuture=CompletableFuture.runAsync(()->{
            try{
                cacheStorage.put(key,value);
            } catch (Exception e){
                throw new CompletionException(e);
            }
        });
        CompletableFuture<Void> dbFeture=CompletableFuture.runAsync(()->{
            try{
                dbStorage.write(key,value);
            }catch (Exception e){
                throw new CompletionException(e);
            }
        });
        CompletableFuture.allOf(cacheFuture,dbFeture).join();
    }
}
