package programming;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] rnos = new int[5];
//        int[] rnos = new int[10]{1, 2, 3, 4, 5}; // not allowed
        int[] rnos2 = {1, 2, 3, 4, 5};

//        System.out.println(Arrays.binarySearch(rnos2, 3));
//        System.out.println("car".length());
//        System.out.println(rnos2.length);

        int[][] arr2D = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        for (int[] arr: arr2D) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

//        int[][] arr2D2 = new int[3][];
//        int[][] arr2D3 = new int[3][4];
//        int[][] arr2D4 = new int[][]{
//                {1, 2, 3},
//                {4, 5, 6, 9},
//                {7},
//        };
//        int[][] arr2D5 = new int[][8]; // not allowed
    }
}
