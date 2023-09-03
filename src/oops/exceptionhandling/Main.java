package oops.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
//            divide(a,b);
            throw new Exception("This is a normal exception");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Generic Exception");
        }
        finally{
            System.out.println("This will always execute");
        }

//      if we will not catch the exception then the program will terminate abnormally and not execute the next line
        System.out.println("Helooo");
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("b cant be 0");
        }
        return a/b;
    }
}
