package com.sukesh.functional.algorithms.cache.lru;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Sample Map :
 * {key2 : Node
 *  key1 : Node
 *  key3 : Node}
 *  Node corresponds to one of the entries in the linkedList
 *
 *  Sample DoublyLinkedList below
 *  dummyHead <->{key3:value1} <-> {key2:value2} <-> {key1:value3} <-> dummyTail
 *  {key4 : value4}
 */
public class LeastRecentlyUsedCache {

    private Map<Integer, DoublyLinkedNode> cache;
    private final int capacity;
    private int size;
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;

    public LeastRecentlyUsedCache(int capacity) {
        cache = new HashMap<>();
        this.capacity = capacity;
        this.size = 0;

        //Initialize a tail and head
        head = new DoublyLinkedNode();
        tail = new DoublyLinkedNode();

        head.next = tail;
        tail.prev = head;

    }

    /**
     * Puts a new key value pair to the cache. If the cache is full , the lease
     * recently used entry will be evicted and new value will be inserted.
     * @param key
     * @param value
     */
    public void put(Integer key , Integer value){

        DoublyLinkedNode node = cache.get(key);

        if(node == null){
            node = new DoublyLinkedNode();
            node.key = key;
            node.value = value;
            cache.put(key,node);
            //Insert the entry in to the linkedList
            addNode(node);
            ++size;
            //Remove the least used entry when the size is greater than capacity
            if(size > capacity){
                DoublyLinkedNode tail = removeTheTail();
                cache.remove(tail.key);
                --size;
            }
        }else{
            //Update the node value and move to the head
            node.value = value;
            moveToHead(node);
        }
    }

    /**
     * gets the value based on the key
     * @param key
     * @return
     */
    public Integer get(Integer key){
        DoublyLinkedNode node = cache.get(key);
        moveToHead(node);
        return node.value;
    }

    /**
     * return the size of the cache
     * @return : The size of the cache
     */
    public int size(){
        return cache.size();
    }

    private void addNode(DoublyLinkedNode node) {
        DoublyLinkedNode next = head.next;
        node.prev = head;
        node.next = next;
        next.prev = node;
        head.next = node;
    }

    private void removeNode(DoublyLinkedNode node){
        DoublyLinkedNode prev = node.prev;
        DoublyLinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    /**
     * Remove the node from its current position and add at the head position (immediately after the dummyHead)
     * @param node
     */
    private void moveToHead(DoublyLinkedNode node){
        removeNode(node);
        addNode(node);
    }

    /**
     * Removes the node at the tail(The one before dummyTail) of the linkedList
     * @return : DoublyLinkedNode - The node which was removed
     */
    private DoublyLinkedNode removeTheTail(){
        DoublyLinkedNode nodeToBeRemoved = tail.prev;
        removeNode(nodeToBeRemoved);
        return nodeToBeRemoved;
    }

    /**
     * Doubly linked Node , the node stores a key and a value
     * and it has pointers to the next object and the previous object
     */
    public class DoublyLinkedNode {
        int key;
        int value;
        DoublyLinkedNode prev;
        DoublyLinkedNode next;
    }

}
