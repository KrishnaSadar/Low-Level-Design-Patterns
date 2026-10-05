package DesignACache.UtilityClasses;

public class DoublyLinkedListNode <K>{

    private final K value;
    DoublyLinkedListNode<K>prev;
    DoublyLinkedListNode<K>next;
    public DoublyLinkedListNode(K value){
        this.value=value;
        next=null;
        prev=null;
    }
    public K getValue(){
        return value;
    }
}
