package oops.generics;

import java.util.Arrays;

// Restriction on Generics
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects
public class CustomGenArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public CustomGenArrayList() {
//        since we cant create instance of T[] hence we need to create an array of Object type and type cast it to T
        data = new Object[DEFAULT_CAPACITY];
    }

    public void add(T element){
        if(isFull()){
            resize();
        }
        data[size++] = element;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public T remove(int index){
        T removed = (T)(data[--size]);
        data[size] = null;
        return removed;
    }

    public void set(int index, T element){
        data[index] = element;
        if (index >= size){
            size = index + 1;
        }
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
//        list.add("hdfhd"); //gives error as expected
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(2));
        System.out.println(list);
        list.set(2, 5);
        System.out.println(list);
    }
}
