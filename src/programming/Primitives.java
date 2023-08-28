package programming;

public class Primitives {
    public static void main(String[] args) {
        int rno = 34;
        char letter = 'r';
        float decimal = 56.78f;
        double marks = 34.56543535232;
        long longInt = 345465466645645L;
        boolean bool = true;

        // narrow conversion
        int integerValue = (int)45.67f;


        // automatic type promotion in expressions
        int a = 257;
        // 257 exceeds the range of byte so we take the remainder of 257 / 256 = 1
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        // automatically converted to int while evaluating expression c * d
        int result = c * d / e;
        System.out.println(result);
//        System.out.println("こんにちは");

        int num1, num2;
        num1 = 10;
        num2 = 20;
    }
}
