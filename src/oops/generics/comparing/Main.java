package oops.generics.comparing;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student ananya = new Student("ANANYA", 90.89f);
        Student aayan = new Student("AAYAN", 45f);
        Student aarav = new Student("AARAV", 80.98f);
        Student bhavya = new Student("BHAVYA", 70.9f);

        Student[] students = {ananya, aayan, aarav, bhavya};
        System.out.println(Arrays.toString(students));
//        here the sort method will call the compareTo method of the Student class and do sorting based on marks
        Arrays.sort(students);

//        can also pass a comparator object to the sort method
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
//                in descending order
//                return -(int)(o1.marks - o2.marks);
            }
        });

//        can make the above expression look simpler with lambda expressions
        Arrays.sort(students, (o1, o2) -> (int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(students));

//        if(ananya.compareTo(aayan) > 0) {
//            System.out.println(ananya.name + " scored more than " + aayan.name);
//        }
//        else{
//            System.out.println(aayan.name + " scored more than or equal to" + ananya.name);
//        }
    }
}
