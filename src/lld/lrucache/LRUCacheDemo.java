package lrucache;

/** Requirements for LRU cache:
 * will have some fixed capacity
 * everytime a new element is supposed to be added we check if cache size is full and if so we remove the least recently used element and create space for new element
 * when we get an element from cache, mark it as the most recently used element and if not present then return -1
*/

/** Design:
 *  Use a LinkedList (DLL) to maintain order of cache elements in terms of when last used
 *  Now when I want to get an element I want the access time to be O(1) but L.L will be O(n) so we use a HashMap instead as our actual cache
 *  in hashmap we store (key, value), where value is the actual node of L.L; this makes it easier to move it to the head of L.L marking it as most recently used
 *  The cache should be thread-safe, allowing concurrent access from multiple threads. Use synchronised keyword for get and put methods.
 */

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