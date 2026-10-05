package DesignACache.StorageMechanisms.ConcreteStorage.ConcreteDBStorage;

import DesignACache.StorageMechanisms.Interfaces.DBStorage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleDBStorage<K,V> implements DBStorage<K,V> {
    public final Map<K,V> database=new ConcurrentHashMap<>();
    @Override
    public void write(K key, V value) throws Exception {
        database.put(key,value);
    }

    @Override
    public V read(K key) throws Exception {
        if(!database.containsKey(key)){
            throw new Exception("Key not exists in database");
        }
        return database.get(key);
    }

    @Override
    public void delete(K key) throws Exception {
        if(!database.containsKey(key)){
            throw new Exception("Key Not exists in database");
        }
        database.remove(key);
    }
}
