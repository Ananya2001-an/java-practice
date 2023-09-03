package oops.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human("Harry", 22);
//        Human human2 = new Human(human);
//        System.out.println(human2.name);
//        System.out.println(human2.age);

//        instead we can call the clone method
        Human human2 = human.clone();
//        System.out.println(human2.name + " " + human2.age);
        System.out.println(Arrays.toString(human2.arr));
        human2.arr[0] = 100;
        System.out.println(Arrays.toString(human2.arr));
        System.out.println(Arrays.toString(human.arr));
    }
}
