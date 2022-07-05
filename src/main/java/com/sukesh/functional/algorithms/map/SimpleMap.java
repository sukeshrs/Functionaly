package com.sukesh.functional.algorithms.map;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Map stores key value pairs
 * Sample map entries {1:6} , {"test" : "test"}
 * The map is implemented using an array of LinkedLists
 * @param <K>
 * @param <V>
 */
public class SimpleMap<K,V> {
    private int CAPACITY = 16;
    private int size = 0;
    private LinkedBucket[] bucket;

    SimpleMap(){
        this.bucket = new LinkedBucket[CAPACITY];
    }
    public int size() {
        return size;
    }

    public V get(K key){
        V returnValue;
        int hash = getHash(key);
        LinkedBucket entryListAtHash = bucket[hash];
        if (entryListAtHash == null) {
            return null;
        }else{
            List<Enrty> entries = entryListAtHash.getEntries(key);
            for(Enrty enrty : entries){
                if(key.equals(enrty.key)){
                    return (V) enrty.getValue();
                }
            }
        }
        return null;
    }

    public void put(K key , V value){
        int hash = getHash(key);
        Enrty entry = new Enrty();
        if(bucket[hash] != null){
            bucket[hash].addEntry(entry);
        }else {
            entry.key = key;
            entry.value = value;
            LinkedBucket listAtHash = new LinkedBucket();
            listAtHash.addEntry(entry);
            this.bucket[hash] = listAtHash;
            ++size;
        }
    }

    public boolean containsKey(K key){
        V value =get(key);
        return value !=null ? true : false;
    }

    private int getHash(K key) {
       return (key.hashCode() & Integer.MAX_VALUE)/ CAPACITY;
    }

    public class Enrty<K,V>{
        private K key;
        private V value;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

}
