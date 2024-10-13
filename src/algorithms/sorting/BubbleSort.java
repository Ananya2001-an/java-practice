import java.util.*;

/**
 * here last element gets sorted first
 * worst case T.C. -> O(n^2)
 * inplace, stable, not adaptive
 */

public class BubbleSort{

    void sort(int[] arr, int n){
        int i, j, temp;
        boolean swapped;

//        n-1 passes
//        break when no more swaps happen
        for (i = 0; i < n - 1; i++) {
            swapped = false;
//            compare consecutive elements
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7, 100, 34, 697, -10, 23, 345, 2, 5, 67 };

        System.out.println("Given array is");
        System.out.println(Arrays.toString(arr));

        BubbleSort ob = new BubbleSort();

        long startTime = System.nanoTime();
        ob.sort(arr, arr.length);
        long endTime = System.nanoTime();

        System.out.println("\nSorted array is");
        System.out.println(Arrays.toString(arr));

        long executionTime = (endTime - startTime) / 1000000;
        System.out.println("Took " + executionTime + "ms");
    }
}
