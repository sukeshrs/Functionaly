package com.sukesh.functional.algorithms.map;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LinkedBucket<K,V> {
    private List<SimpleMap.Enrty> bucket;

    public LinkedBucket() {
        if(bucket == null) {
            this.bucket = new LinkedList<>();
        }
    }

    public SimpleMap.Enrty addEntry(SimpleMap.Enrty entry){
        this.bucket.add(entry);
        return entry;
    }

    public List<SimpleMap.Enrty> getEntries(K key){
        return this.bucket;
    }

    public void removeEntry(K key){
        this.bucket.remove(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedBucket<?, ?> that = (LinkedBucket<?, ?>) o;
        return Objects.equals(bucket, that.bucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket);
    }
}
