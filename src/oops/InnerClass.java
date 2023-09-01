package oops;

public class InnerClass {
    static class Test{
        String name;
        Test(){
            this.name = "Ananya";
        }
        void fun(){
            System.out.println("fun");
        }

//        toString() is a method of Object class which is the parent class of all classes in Java
//        It is used to print the object in a readable format
//        If we don't override it then it will print the address of the object
        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
//        If Test class was not static then we would have to create an object of InnerClass to access Test class
//        InnerClass ob = new InnerClass();
//        InnerClass.Test ob1 = ob.new Test();

        Test ob = new Test();
        System.out.println(ob);
        ob.fun();
    }
}
