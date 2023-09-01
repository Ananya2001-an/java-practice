package oops.properties.inheritance;

public class Box {
//    since l is declared as private here, it can't be accessed directly in BoxWeight class
    private double l;
    public double b;
    public double h;

    double weight = 100;

    static void greeting(){
        System.out.println("Hello from Box");
    }

//    getter method (data hiding)
    double getLength(){
        return l;
    }

    public Box(){
        this(1, 1, 1);
    }

    Box(double side){
        this(side, side, side);
    }

    public Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

}
