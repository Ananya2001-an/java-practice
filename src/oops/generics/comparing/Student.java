package oops.generics.comparing;

public class Student implements Comparable<Student>{
    String name;
    float marks;

    Student(String name, float marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = this.marks > o.marks ? 1 : this.marks < o.marks ? -1 : 0;
        return diff;
    }
}
