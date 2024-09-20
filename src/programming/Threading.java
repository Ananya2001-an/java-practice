/**
 * Threads can be created in 3 ways
 * 1. Inheriting from Thread class
 * 2. Implementing Runnable Interface
 * 3. Using Anonymous Declarations
 */

public class Threading extends Thread {
    public static void main(String[] args){
        Threading thread = new Threading();
//        thread.run();
        thread.start();
    }

    @Override
    public void run() {
        // contains all the code you want to execute
        // when the thread starts

        // prints out the name of the thread
        // which is running the process
        /**
         * One common mistake is to call the run() method to start the thread. It might seem correct as everything works just fine, but calling the run() method does not start a new thread. Instead, it executes the code of the thread inside the parent thread. We use the start() method to execute a new thread.
         */
        System.out.println(Thread.currentThread().getName()); //prints "main" if call thread.run() else "Thread-0"
    }
}



/**
 * Both the methods work exactly the same with no difference in performance. However, the Runnable interface leaves the option of extending the class with some other class since you can inherit only one class in Java. It’s also easier to create a thread pool using runnables.
 */

//public class ExampleRunnable implements Runnable {
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName());
//    }
//}
//
//public class ThreadExamples {
//    public static void main(String[] args) {
//        ExampleRunnable runnable = new ExampleRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();
//    }
//}


/**
 * This method is very similar to the above method. But instead of creating a new class that implements the runnable method, you create an anonymous function that contains the task you want to execute.
 */
//public class Main {
//    public static void main(String[] args) {
//        Thread thread = new Thread(() -> {
//            // task you want to execute
//            System.out.println(Thread.currentThread().getName());
//        });
//        thread.start();
//    }
//}



/**
 * If we call the threadOne.join() method inside threadTwo, it will put threadTwo into a state of waiting until the threadOne has finished execution.
 *
 * Calling Thread.sleep(long timeInMilliSeconds) static method will put the current thread into a state of timed waiting.
 */



/**
 * A thread can be in one of the following states. Use Thread.getState() to get the current state of the thread.
 *
 * NEW: created but has not started execution
 * RUNNABLE: started execution
 * BLOCKED: waiting to acquire a lock
 * WAITING: waiting for some other thread to perform a task
 * TIMED_WAITING: waiting for a specified time period
 * TERMINATED: completed execution or aborted
 */



/**
 * Executors and Thread Pools
 * Threads require some resources to start, and they are stopped after the task is done. For applications with many tasks, you would want to queue up tasks instead of creating more threads. Wouldn’t it be great if we could somehow reuse existing threads while also limiting the number of threads you can create?
 *
 * The ExecutorService class allows us to create a certain number of threads and distribute tasks among the threads. Since you are creating a fixed number of threads, you have a lot of control over the performance of your application.
 */

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class Main {
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//
////        20 tasks are given to the executor which is responsible to distribute them to the 2 threads
//        for (int i = 0; i < 20; i++) {
//            int finalI = i;
//            executor.submit(() -> System.out.println(Thread.currentThread().getName() + " is executing task " + finalI));
//        }
//        executor.shutdown();
//    }
//}


/**
 * A race condition is a condition of a program where its behavior depends on the relative timing or interleaving of multiple threads or processes. To better understand this, let’s look at the example below.
 */

//public class Increment {
//    private int count = 0;
//
//    public void increment() {
//        count += 1;
//    }
//
//    public int getCount() {
//        return this.count;
//    }
//}
//
//public class RaceConditionsExample {
//    public static void main(String[] args) {
//        Increment eg = new Increment();
//        for (int i = 0; i < 1000; i++) {
//            Thread thread = new Thread(eg::increment);
//            thread.start();
//        }
//        System.out.println(eg.getCount());
//    }
//}

/**
 * Here, we have an Increment class which stores a variable count and a function that increments the count. In the RaceConditionsExample, we’re starting a thousand threads, each of which will invoke the increment() method. Finally, we’re waiting for all the threads to finish executing and then print out the value of the count variable.
 *
 * If you run the code multiple times, you’ll notice that sometimes the final value of count is less than 1,000. To understand why this happens, let’s take two threads, Thread-x and Thread-y, as examples. The threads can execute the read write operation in any order. So, there will be a case when the order of execution is as follows.
 *
 * Thread-x: Reads this.count (which is 0)
 * Thread-y: Reads this.count (which is 0)
 * Thread-x: Increments this.count by 1
 * Thread-y: Increments this.count by 1
 * Thread-x: Updates this.count (which becomes 1)
 * Thread-y: Updates this.count (which becomes 1)
 *
 * In this case, the final value of the count variable is 1 and not 2. This is because both the threads are reading the count variable before any of them can update the value. This is known as a race condition. More specifically, a “read-modify-write” race condition.
 */


/**
 * Synchronization Strategies
 * In the previous section, we examined what race conditions are. In order to avoid race conditions, we need to synchronize tasks. In this section, we’ll look at different ways to synchronize different processes across multiple threads.
 * 1. Lock
 * 2. ReadWriteLock
 * 3. Synchronized Blocks And Methods
 */

// Lock
/**
 * There will be cases when you’d want a task to be executed by a single thread at a time. But how would you make sure a task is being executed by only one thread?
 *
 * One way to do so is by using locks. The idea is that you create a lock object that can be “acquired” by a single thread at a time. Before performing a task, the thread tries to acquire the lock. If it’s successful in doing so, it proceeds with the task. Once it’s done performing the task, it releases the lock. If the thread fails to acquire the lock, it means the task is being executed by another thread.
 */

//import java.util.concurrent.locks.ReentrantLock;
//
//
//public class LockExample {
//    private final ReentrantLock lock = new ReentrantLock();
//    private int count = 0;
//
//    public int increment() {
//        lock.lock();
//        try {
//            return this.count++;
//        } finally {
//            lock.unlock();
//        }
//    }
//}

/**
 * When we call the lock() method in a thread, it tries to acquire the lock. If it’s successful, it executes the task. However, if it’s unsuccessful, the thread is blocked until the lock is released.
 *
 * The isLocked() returns a boolean value depending on whether lock can be acquired or not.
 *
 * The tryLock() method tries to acquire the lock in a nonblocking way. It returns true if it’s successful and false otherwise.
 *
 * The unlock() method releases the lock.
 */


// ReadWriteLock

/**
 * When working with shared data and resources, usually, you’d want two things:
 *
 * Multiple threads should be able to read the resource at a time if it’s not being written.
 * Only one thread can write the shared resource at a time if no other thread is reading or writing it.
 * ReadWriteLock Interface achieves this by using two locks instead of one. The read lock can be acquired by multiple threads at a time if no thread has acquired the write lock. The write lock can be acquired only if both read and write lock have not been acquired.
 *
 *
 * We want multiple threads to read our cache at the same time (while it’s not being written). But only one thread can write our cache at a time. To achieve this, we will use the ReentrantReadWriteLock which is an implementation of the ReadWriteLock interface.
 */

//public class SharedCache {
//    private Map<String, String> cache = new HashMap<>();
//    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//
//    public String readData(String key) {
//        lock.readLock().lock();
//        try {
//            return cache.get(key);
//        } finally {
//            lock.readLock().unlock();
//        }
//    }
//
//
//    public void writeData(String key, String value) {
//        lock.writeLock().lock();
//        try {
//            cache.put(key, value);
//        } finally {
//            lock.writeLock().unlock();
//        }
//    }
//}



//Synchronized Blocks And Methods
/**
 * Synchronized blocks are pieces of Java code that can be executed by only one thread at a time. They are a simple way to implement synchronization across threads.
 */

// SYNTAX
//synchronized (Object reference_object) {
//   // code you want to be synchronized
//}

/**
 * When you create a synchronized block, you need to pass a reference object. In the above example ”this” or the current object is the reference object, which means if multiple instances of the are created, they won’t be synchronized.
 *
 * You can also make a method synchronized by using the synchronized keyword.
 */

//public synchronized int increment();


/**
 * Deadlock
 *
 * Consider this, you have two threads and two locks (let’s call them threadA, threadB, lockA and lockB). ThreadA will try to acquire lockA first and if it’s successful, it will try to acquire lockB. ThreadB, on the other hand, tries to acquire lockB first and then lockA.
 */

//import java.util.concurrent.locks.ReentrantLock;
//
//public class Main {
//    public static void main(String[] args) {
//        ReentrantLock lockA = new ReentrantLock();
//        ReentrantLock lockB = new ReentrantLock();
//
//        Thread threadA = new Thread(() -> {
//            lockA.lock();
//            try {
//                System.out.println("Thread-A has acquired Lock-A");
//                lockB.lock();
//                try {
//                    System.out.println("Thread-A has acquired Lock-B");
//                } finally {
//                    lockB.unlock();
//                }
//            } finally {
//                lockA.unlock();
//            }
//        });
//
//        Thread threadB = new Thread(() -> {
//            lockB.lock();
//            try {
//                System.out.println("Thread-B has acquired Lock-B");
//                lockA.lock();
//                try {
//                    System.out.println("Thread-B has acquired Lock-A");
//                } finally {
//                    lockA.unlock();
//                }
//            } finally {
//                lockB.unlock();
//            }
//        });
//
//        threadA.start();
//        threadB.start();
//    }
//}


/**
 * Here are some points to keep in mind to avoid deadlocks.
 *
 * Define a strict order in which resources should be acquired. All threads must follow the same order when requesting resources.
 * Avoid nesting of locks or synchronized blocks. The cause for the deadlock in the previous example was that the threads were not able to release one lock without acquiring the other lock.
 * Ensure that threads do not acquire multiple resources simultaneously. If a thread holds one resource and needs another, it should release the first resource before attempting to acquire the second. This prevents circular dependencies and reduces the likelihood of deadlocks.
 * Set timeouts when acquiring locks or resources. If a thread fails to acquire a lock within a specified time, it releases all acquired locks and tries again later. This prevents a situation where a thread holds a lock indefinitely, potentially causing a deadlock.
 */



/**
 * Java Concurrent Collections
 * The Java platform provides several concurrent collections in the “java.util.concurrent” package that are designed to be thread-safe and support concurrent access.
 *
 * 1. ConcurrentHashMap
 * The ConcurrentHashMap is a thread-safe alternative to HashMap. It provides methods optimized for atomic updates and retrieval operations. For example, putIfAbsent(), remove(), and replace() methods perform the operations atomically and avoid race conditions.
 *
 * 2. CopyOnWriteArrayList
 * CopyOnWriteArrayList solves this problem by copying the content of the entire array every time it is modified. That way, we can iterate over the previous copy while a new copy is being modified.
 *
 * The thread-safety mechanism of CopyOnWriteArrayList comes with a cost. Modifying operations, such as adding or removing elements, are expensive because they require creating a new copy of the underlying array. This makes CopyOnWriteArrayList suitable for scenarios where reads are more frequent than writes.
 */



/**
 * If you are looking to build a high-performance application that is operating system independent, then opting for Java concurrency is a great option.
 */