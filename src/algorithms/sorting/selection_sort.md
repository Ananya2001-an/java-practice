```java
import java.util.*;

public class SelectionSort{

    void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7, 100, 34, 697, -10, 23, 345, 2, 5, 67 };
 
        System.out.println("Given array is");
        System.out.println(Arrays.toString(arr));
 
        SelectionSort ob = new SelectionSort();
        
        long startTime = System.nanoTime();
        ob.sort(arr);
        long endTime = System.nanoTime();
 
        System.out.println("\nSorted array is");
        System.out.println(Arrays.toString(arr));

        long executionTime = (endTime - startTime) / 1000000;
        System.out.println("Took " + executionTime + "ms");
    }
}
```
