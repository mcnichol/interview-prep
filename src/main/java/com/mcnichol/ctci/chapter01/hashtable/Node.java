package com.mcnichol.ctci.chapter01.hashtable;

public class Node<K, V> {
    public K key;
    public V value;
    public Node<K, V> next;

    Node() {

    }

    Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}