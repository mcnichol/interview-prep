package com.mcnichol.interviewing.datastructure.hashtable;

public class HashTable<K, V> {
    private static final int DEFAULT_BUCKET_SIZE = 10;
    private int size;
    private Node[] table;

    HashTable() {
        this(DEFAULT_BUCKET_SIZE);
    }

    HashTable(int bucketSize) {
        this.table = new Node[bucketSize];

        for (int i = 0; i < bucketSize; i++) {
            table[i] = new Node();
        }
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    void put(K key, V value) {
        size++;

        Node<K, V> putNode = new Node<>(key, value);

        int idx = getHash(key) % table.length;
        Node nodeList = table[idx];

        table[idx] = setLastNode(nodeList, putNode);
    }

    private Node<K, V> setLastNode(Node<K, V> node, Node<K, V> setNode) {
        if (node == null) {
            return setNode;
        }

        node.next = setLastNode(node.next, setNode);

        return node;
    }

    @SuppressWarnings("unchecked")
    V get(K key) {

        V response = null;

        Node nodeTree = table[getHash(key) % table.length];

        while (nodeTree.next != null) {
            nodeTree = nodeTree.next;

            if (nodeTree.key.equals(key)) {
                response = (V) nodeTree.value;
                break;
            }
        }

        return response;
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode());
    }

//    @Todo - Print in Columnar report
    public void collisionDepth() {
        for (int i = 0; i < table.length; i++) {
            int depth = getDepth(table[i]);
            System.out.println(depth);
        }
    }

    private int getDepth(Node node) {
        return countNext(node, 0);
    }

    private int countNext(Node node, int count) {
        if (node.next == null) {
            return count;
        }

        return count + countNext(node.next, ++count);
    }

}
