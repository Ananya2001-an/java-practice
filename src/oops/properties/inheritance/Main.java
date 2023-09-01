package oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        BoxWeight ob = new BoxWeight();
//        BoxWeight ob1 = new BoxWeight(1,2,3,5);
//        System.out.println(ob);
//        System.out.println(ob1);

//        ref variable indicates which methods and properties can be accessed
//        Box ob = new BoxWeight();
//        System.out.println(ob.weight);  //gives error as weight is not a property of Box class

//        is not allowed at all since Box is not a subclass of BoxWeight so saying that we can access weight even when the object is of Box class is wrong
//        BoxWeight ob1 = new Box();
        Box ob = new BoxWeight();
        ob.greeting(); //doesn't override the static method of parent class

        BoxWeight ob1 = new BoxWeight();
        ob1.greeting();

        BoxWeight.greeting();
        Box.greeting();
    }
}
