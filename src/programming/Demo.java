package programming;

import java.util.Scanner;

// class is public means we can access it from anywhere. The public class name should be the same name as the file name.
public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 20;
        Scanner in = new Scanner(System.in);
//        System.out.println(in.nextInt());
        System.out.println("The number is: " + in.nextInt());
    }
}