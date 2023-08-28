package oops;

import java.lang.ref.Cleaner;

public class Main {
    public static void main(String[] args) {
        Student ananya = new Student("Ananya", 22, false);
        ananya.sleep();
    }
}

class Student {
    String name;
    int age;
    boolean isGraduated;

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
        this.name = "Ananya";
        this.age = 20;
        this.isGraduated = false;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Student object is garbage collected");
//    }
}
