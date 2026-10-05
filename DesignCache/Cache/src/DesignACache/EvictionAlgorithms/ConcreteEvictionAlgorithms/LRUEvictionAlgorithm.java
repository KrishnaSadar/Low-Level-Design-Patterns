package DesignACache.EvictionAlgorithms.ConcreteEvictionAlgorithms;

import DesignACache.EvictionAlgorithms.EvictionAlgorithm;
import DesignACache.UtilityClasses.DoublyLinkedList;
import DesignACache.UtilityClasses.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LRUEvictionAlgorithm<K> implements EvictionAlgorithm<K> {
    private final DoublyLinkedList<K> dll;
    private final Map<K, DoublyLinkedListNode<K>>keyToNodeMap;

    public LRUEvictionAlgorithm(){
        this.dll=new DoublyLinkedList<>();
        this.keyToNodeMap=new HashMap<>();
    }
    @Override
    public synchronized void keyAccessed(K key) throws Exception {
        if(keyToNodeMap.containsKey(key)){
            DoublyLinkedListNode<K> node=keyToNodeMap.get(key);
            dll.detachNode(node);
            dll.addNodeAtTail(node);
        }else{
            DoublyLinkedListNode<K> node = new DoublyLinkedListNode<>(key);
            dll.addNodeAtTail(node);
            keyToNodeMap.put(key,node);
        }
    }

    @Override
    public synchronized K evictKey() throws Exception {
        DoublyLinkedListNode<K> nodeToEvict=dll.getHead();
        if(nodeToEvict==null){
            return null;
        }
        K evictKey=nodeToEvict.getValue();
        dll.removeHead();
        keyToNodeMap.remove(evictKey);
        return evictKey;
    }
}
