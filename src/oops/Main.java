package oops;

import oops.properties.inheritance.Box;

public class Main {
    public static void main(String[] args) {
//        Student ananya = new Student("Ananya", 22, false);
//        Student aayan = new Student("Aayan", 16, false);
//        System.out.println(ananya.noOfStudents);
//        System.out.println(Student.noOfStudents);

//        Main ob = new Main();
//        ob.fun();

        SingletonClass obj1 = SingletonClass.getInstance();

        SingletonClass obj2 = SingletonClass.getInstance();

//        both ref variables are pointing to the same object since the constructor is private
        System.out.println(obj1 == obj2);

//        can't access constructor outside package since not public, add public to access
        Box box1 = new Box(1, 2, 3);
//        instance variables can be accessed directly only if they are public
        System.out.println(box1.b);
    }

    void fun() {
        System.out.println("fun");
    }
}

class Student {
    String name;
    int age;
    boolean isGraduated;
    static int noOfStudents;

//    runs only once when the class is loaded (first object is created). Is used to initialize static variables
    static {
        System.out.println("This is called a static block!!!");
        noOfStudents = 0;
    }

    void study() {
        System.out.println(name + " is studying");
//        System.out.println(this.name + " is studying");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    Student(){
//      here this is replaced by Student(class name) instead of the object name
        this("Ananya", 20, false);
    }

    Student(String name, int age, boolean isGraduated){
        this.name = name;
        this.age = age;
        this.isGraduated = isGraduated;
        noOfStudents++; // or Student.noOfStudents++;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Student object is garbage collected");
//    }
}
