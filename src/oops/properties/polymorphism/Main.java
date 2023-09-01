package oops.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes ob = new Shapes();
        ob.area();
//        depends on the object type which is Circle here
        Shapes ob1 = new Circle();
        ob1.area();
    }
}
