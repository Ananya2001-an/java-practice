package programming;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            // this is a block
//            int a = 30; // this will give an error
            a = 30;
//            Values initialized in a block are not accessible outside the block
//            And values initialized outside the block are accessible inside the block but cannot be reinitialized like 'a' here
            int c = 30;
            System.out.println(c);
        }
    }
}
