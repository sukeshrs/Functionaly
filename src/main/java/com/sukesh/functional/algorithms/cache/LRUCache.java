package com.sukesh.functional.algorithms.cache;

import java.util.Optional;

public class LRUCache<K,V> implements Cache<K,V>{
    int size;

    public LRUCache(int size){
        this.size = size;
    }


    @Override
    public boolean set(K key, V value) {
        return false;
    }

    @Override
    public Optional<V> get(K key) {
        return Optional.empty();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
