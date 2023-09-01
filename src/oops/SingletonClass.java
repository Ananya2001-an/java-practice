package oops;

public class SingletonClass {
//    private constructor so that no other class can create an object of this class
    private SingletonClass() {
    }
    private static SingletonClass instance;

//    static method to return the instance of the class
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
