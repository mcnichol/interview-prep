package com.mcnichol.ctci.chapter01.hashtable;

public class Node<K, V>{
    private K key;
    private V value;

    Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
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
