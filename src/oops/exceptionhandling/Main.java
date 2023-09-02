package oops.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
            divide(a,b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b){
        if (b == 0){
            throw new ArithmeticException("b cant be 0");
        }
        return a/b;
    }
}
