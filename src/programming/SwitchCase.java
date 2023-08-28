package programming;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("I am on leave");
            case 2 -> System.out.println("I am in office");
            case 3 -> System.out.println("I am playing football");
            default -> System.out.println("I don't know what day it is");
        }
    }
}
