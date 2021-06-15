package Java_1.lesson_11_generics;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Замена элементов массива
        String[] arr = {
            "first", "second", "third"
        };
        arr =  changeItemsArray(arr, 0, 2);
        System.out.println(Arrays.toString(arr));

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox.addFruit(3, new Apple());
        orangeBox1.addFruit(4, new Orange());
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2.getWeight());
        System.out.println(appleBox.compare(orangeBox1));
        orangeBox1.moveContentInOtherBox(orangeBox2);
        System.out.println(orangeBox2.getWeight());
    }


    static <T extends Object> T[] changeItemsArray(T[] arr, int firstChangeItem, int secondChangeItem) {
        if (firstChangeItem < 0 || firstChangeItem > arr.length - 1){
            System.out.println("Указанный индекс первого заменяемого элемента массива выходит за пределы массива");
            return arr;
        }
        if (secondChangeItem < 0 || secondChangeItem > arr.length - 1){
            System.out.println("Указанный индекс второго заменяемого элемента массива выходит за пределы массива");
            return arr;
        }
        T temp = arr[firstChangeItem];
        arr[firstChangeItem] = arr[secondChangeItem];
        arr[secondChangeItem] = temp;
        return arr;
    }

    static <T> List<T> convertArrayToList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (T t : arr) {
            list.add(t);
        }
        return list;
    }
}
