package programming;

public class PassingValues {
    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
        int[] arr = {10, 20};
        swap(arr);
        System.out.println(arr[0] + " " + arr[1]);

        varArgs(1, 2, 3, 4, 5);
    }

//    primitive types are passed by value hence the original value of x and y are not swapped
//    static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }

//    reference types are passed by reference hence the original value of x and y are swapped
    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

//    varargs is a feature in java that allows us to pass any number of arguments to a function without creating an array to hold them.
//    Denoted as "dt ...<name>"
    static void varArgs(int ...arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

//    varargs can be used with other arguments as well
//    varargs should always be the last argument
    static void varArgs2(int a, int b, String ...v) {
        System.out.println(a);
        System.out.println(b);
        for (String s : v) {
            System.out.println(s);
        }
    }
}
