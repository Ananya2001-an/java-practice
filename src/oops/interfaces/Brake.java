package oops.interfaces;

public interface Brake {

    default void fun(){
        System.out.println("Have fun");
    }
    static void hello(){
        System.out.println("Hello");
    }
    void apply();
    void release();
}
