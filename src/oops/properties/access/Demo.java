package oops.properties.access;

public class Demo {
    private int a;

    static class Demo2 extends Demo {
        public Demo2() {
            super();
        }

        void fun(){
            System.out.println(super.a);
        }
    }

    public Demo(){
        this.a = 1;
    }
}



