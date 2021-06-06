package HomeWork3_1;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1, 1, 3);
        swap(arr2, 0, 2);

        Integer[] arr = {1, 2, 3, 4, 5};
        asList(arr);

        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Задание 3");
        System.out.println("Добавляем фрукты в коробки: ");
        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(),12);
        ap.addFruit(new Apple(),8);
        ap1.addFruit(new Apple(),4);
        System.out.println("Box or: "+or.getWeight());
        System.out.println("Box or1: "+or1.getWeight());
        System.out.println("Box ap: "+ap.getWeight());
        System.out.println("Box ap1: "+ap1.getWeight());
        System.out.println("Сравнение коробок по весу:");
        System.out.println("Box or equals box ap: "+or.compare(ap));
        System.out.println("Box or1 equals box ap1: "+or1.compare(ap1));
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("Вес одной коробки после пересыпания: ");
        System.out.println("Box or: "+or.getWeight());
        System.out.println("Box or1: "+or1.getWeight());
        System.out.println("Box ap: "+ap.getWeight());
        System.out.println("Box ap1: "+ap1.getWeight());


    }
    public static void swap(Object[] arr, int a, int b){
        Object tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        System.out.println("Задание 1: " + Arrays.toString(arr));
    }
    public static <T> void asList(T[] arr){
        ArrayList<T> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Задание 2: " + list);
    }
}



