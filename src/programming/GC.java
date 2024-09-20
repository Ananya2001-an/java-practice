/**
 * In C/C++, a programmer is responsible for both the creation and destruction of objects. Usually, programmer neglects the destruction of useless objects. Due to this negligence, at a certain point, sufficient memory may not be available to create new objects, and the entire program will terminate abnormally, causing OutOfMemoryErrors.
 */

/**
 * Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.
 *
 * To do so, we were using free() function in C language and delete() in C++. But, in java it is performed automatically. So, java provides better memory management.
 */

/**
 * Advantage of Garbage Collection
 * It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
 * It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.
 */


// How can an object be unreferenced?
// 1. By nulling a reference
// Employee e=new Employee();
// e=null;

//2. By assigning a reference to another:
// Employee e1=new Employee();
// Employee e2=new Employee();
// e1=e2;//now the first object referred by e1 is available for garbage collection

//3. By anonymous object:
// new Employee();


/**
 * finalize() method
 * The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. This method is defined in Object class as:
 */

/**
 * The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.
 */

/**
 * Garbage collection is performed by a daemon thread called Garbage Collector(GC). This thread calls the finalize() method before object is garbage collected.
 */


public class GC{
    public void finalize()
    {
        System.out.println("object is garbage collected");
    }

    public static void main(String args[]){
        GC s1=new GC();
        GC s2=new GC();
        s1=null;
        s2=null;
        System.gc();
    }
}