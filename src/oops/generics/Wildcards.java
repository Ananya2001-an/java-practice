package oops.generics;

public class Wildcards {

    public void getList(CustomGenArrayList<?> list){
        System.out.println(list);
    }

    public void getList2(CustomGenArrayList<? extends Number> list){
        System.out.println(list);
    }
    public static void main(String[] args) {

    }
}
