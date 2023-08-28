package programming;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(34);
        list.add(1);
        list.add(8);
        list.add(0, 99);
        list.set(0, 100);

//        create a multidimensional arraylist
        ArrayList<ArrayList<Integer>> multidimensionalList = new ArrayList<>();
        multidimensionalList.add(list);
        multidimensionalList.add(new ArrayList<>());
        System.out.println(multidimensionalList);
    }
}
