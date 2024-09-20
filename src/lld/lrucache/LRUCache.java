package lrucache;

import java.util.HashMap;
import java.util.Map;

// this is our ADT for implementing LRU cache using hashmap and L.L
class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, Node<K, V>> cache;
    private final Node<K, V> head;
    private final Node<K, V> tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        // create a hashmap of predefined size
        // when you call size() it will return no of elements in cache
        cache = new HashMap<>(capacity);
        // initialize head and tail pointers
        head = new Node<>(null, null);
        tail = new Node<>(null, null);
        head.next = tail;
        tail.prev = head;
    }

    public synchronized V get(K key) {
        Node<K, V> node = cache.get(key);
        // node not present in cache so return null
        if (node == null) return null;
        // if present return value and also move node to head of list marking it as most recently used element
        moveToHead(node);
        return node.value;
    }

    public synchronized void put(K key, V value) {
        Node<K, V> node = cache.get(key);
        if (node != null) {
            node.value = value;
            moveToHead(node);
            return;
        }

        node = new Node<>(key, value);
        // remove LRU element from L.L and cache
        if (cache.size() == capacity) {
            Node<K, V> removedNode = removeTail();
            cache.remove(removedNode.key);
        }
        cache.put(key, node);
        addToHead(node);
    }

    private void addToHead(Node<K, V> node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void moveToHead(Node<K, V> node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private Node<K, V> removeTail() {
        Node<K, V> node = tail.prev;
        removeNode(node);
        return node;
    }
}
