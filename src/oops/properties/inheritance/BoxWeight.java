package oops.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

//    cant override static methods but can inherit them
//    @Override
    static void greeting(){
        System.out.println("Hello from BoxWeight");
    }

    BoxWeight(){
        this.weight = 1;
    }

    BoxWeight(double l, double b, double h, double weight){
        super(l, b, h);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BoxWeight{" +
                "l=" + getLength() +
                ", b=" + b +
                ", h=" + h +
                ", parent_weight=" + super.weight + // super keyword is used to access the properties of parent class
                ", child_weight=" + weight +
                '}';
    }
}
