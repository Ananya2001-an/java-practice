package oops.properties.abstraction;

public abstract class Parent {

    public Parent(){
        System.out.println("Parent constructor");
    }
    public abstract void method1();
    public abstract void method2();
    public void method3() {
        System.out.println("Parent method3");
    }
}
