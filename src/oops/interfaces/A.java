package oops.interfaces;

public class A {
//    Nested interface
    public interface Test{
        void fun();
    }

    public static void main(String[] args) {
        Test test = new B();
        test.fun();
    }
}

class B implements A.Test{

    @Override
    public void fun() {
        System.out.println("Hello");
    }
}
