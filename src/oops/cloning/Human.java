package oops.cloning;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    }

//    public Human(Human human){
//        this.name = human.name;
//        this.age = human.age;
//    }

    @Override
    public Human clone() throws CloneNotSupportedException {
//        creates a shallow copy
//        return (Human)super.clone();

//        creates a deep copy
        Human twin = (Human)super.clone();
        twin.arr = this.arr.clone(); //create a new array object and copy all the elements
        return twin;
    }
}
