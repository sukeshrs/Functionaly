package com.sukesh.functional.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<T,U> implements Map<T,U> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public U get(Object key) {
        return null;
    }

    @Override
    public U put(T key, U value) {
        return null;
    }

    @Override
    public U remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends T, ? extends U> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<T> keySet() {
        return null;
    }

    @Override
    public Collection<U> values() {
        return null;
    }

    @Override
    public Set<Entry<T, U>> entrySet() {
        return null;
    }
}
