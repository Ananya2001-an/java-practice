/** Requirements for LRU cache:
 * will have some fixed capacity
 * everytime a new element is supposed to be added we check if cache size is full and if so we remove the least recently used element and create space for new element
 * when we get an element from cache, mark it as the most recently used element and if not present then return -1
*/

/** Design:
 *  Use a LinkedList (DLL) to maintain order of cache elements in terms of when last used
 *  Now when I want to get an element I want the access time to be O(1) but L.L will be O(n) so we use a HashMap instead as our actual cache
 *  in hashmap we store (key, value), where value is the actual node of L.L; this makes it easier to move it to the head of L.L marking it as most recently used
 */

package lld;

import java.util.*;

// DLL makes it easy to move node to other location by just changing ptrs
class Node<K, V>{
    K key;
    V value;
    Node<K, V> next;
    Node<K, V> prev;
}


// this is our ADT for implementing LRU cache using hashmap and L.L
class LRUCache<K, V>{
    private int capacity;
    private Map<K, Node<K, V>> cache;
    private Node<K, V> head;
    private Node<K, V> tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        // create a hashmap of predefined size
        // when you call size() it will return no of elements in cache
        cache = new HashMap<>(capacity);
        // intialize head and tail ptrs
        head = new Node<>(null, null);
        tail = new Node<>(null, null);
    }

    public V get(K key){
        Node<K, V> node = cache.get(key);
        // node not present in cache so return null
        if(node == null) return null;
        // if present return value and also move node to head of list marking it as most recently used element
        moveToHead(node);
        return node.value;
    }

    public void put(K key, V value){
        Node<K, V> node = cache.get(key);
        if(node != null) {
            node.value = value;
            moveToHead(node);
            return;
        }
        
        node = New Node<>(key, value);
        // remove LRU element from L.L and cache
        if(cache.size() == capacity){
            Node<K, V> removedNode = removeTail();
            cache.remove(removedNode.key);
        }
        cache.put(key, node);
        addToHead(node);
    }

    private void addToHead(Node<K, V> node){
        head.prev = node;
        node.next = head;
        head = node;
        node.prev = null;
    }

    private void moveToHead(Node<K, V> node){
        removeNode(node);
        node.next = head;
        head.prev = node;
        node.prev = null;
    }

    private void removeNode(Node<K, V> node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private Node<K, V> removeTail(){
        removeNode(tail);
        tail = tail.prev;
        return tail;
    }
}


public class LRUCacheDemo{
    public static void run(){
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "Value 1");
        cache.put(2, "Value 2");
        cache.put(3, "Value 3");

        System.out.println(cache.get(1)); // Output: Value 1
        System.out.println(cache.get(2)); // Output: Value 2

        cache.put(4, "Value 4");

        System.out.println(cache.get(3)); // Output: null
        System.out.println(cache.get(4)); // Output: Value 4

        cache.put(2, "Updated Value 2");

        System.out.println(cache.get(1)); // Output: Value 1
        System.out.println(cache.get(2)); // Output: Updated Value 2
    }
} 