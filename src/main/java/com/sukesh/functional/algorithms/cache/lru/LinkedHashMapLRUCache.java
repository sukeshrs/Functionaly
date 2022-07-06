package com.sukesh.functional.algorithms.cache.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapLRUCache<K , V> extends LinkedHashMap<K,V> {
    private int capacity;
  //  private LinkedHashMap<K,V> linkedHashMap;
    LinkedHashMapLRUCache(int capacity){
        super(capacity , .75f, true);
        capacity = this.capacity;
    }

    public void putEntry(K key , V value){
        super.put(key, value);
    }

    public V getEntry(K key){
        V v = null;
        return super.getOrDefault(key, v);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
      return  size() > capacity;
    }

}
