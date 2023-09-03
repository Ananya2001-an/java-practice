package oops.exceptionhandling;

public class Demo {
    public static void main(String[] args) {
        try{
//            Main.divide(5, 0);
            throw new CustomException("This is a custom exception");
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
