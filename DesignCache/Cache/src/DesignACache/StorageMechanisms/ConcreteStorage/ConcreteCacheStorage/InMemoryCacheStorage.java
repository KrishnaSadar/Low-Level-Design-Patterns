package DesignACache.StorageMechanisms.ConcreteStorage.ConcreteCacheStorage;

import DesignACache.StorageMechanisms.Interfaces.CacheStorage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryCacheStorage <K,V> implements CacheStorage<K,V> {
    private final Map<K,V> cache;
    private final int capacity;

    public InMemoryCacheStorage(int capacity){
        this.capacity=capacity;
        cache=new ConcurrentHashMap<>();
    }
    @Override
    public void put(K key, V value) throws Exception {
        cache.put(key, value);
    }

    @Override
    public V get(K key) throws Exception {
        if(!cache.containsKey(key)){
            throw new Exception("Key Not in cache: "+key);
        }
        return cache.get(key);
    }

    @Override
    public void remove(K key) throws Exception {
        if(!cache.containsKey(key)){
            throw new Exception("Key Not In Cache: "+key);
        }
        cache.remove(key);
    }

    @Override
    public boolean containsKey(K key) throws Exception {
        return cache.containsKey(key);
    }

    @Override
    public int size() throws Exception {
        return cache.size();
    }

    @Override
    public int getCapcity() {
        return capacity;
    }
}
