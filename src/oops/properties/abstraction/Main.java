package oops.properties.abstraction;

public class Main {
    public static void main(String[] args) {
        Parent p = new Son();
//        Parent pt = new Parent(); //not allowed
        p.method1();
        p.method2();
        p.method3();
    }
}
