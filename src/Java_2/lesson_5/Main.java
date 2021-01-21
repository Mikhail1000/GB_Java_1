package Java_2.lesson_5;

import java.util.Arrays;

public class Main {
    static final int SIZE = 1000000;
    static final int h = SIZE /2;

    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        float[] arrCopy = new float[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
            arrCopy[i] = 1;
        }

        methodA(arr);
        methodB(arrCopy);
    }

    public static void methodA(float[] array) {
        long a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + (i + 0) / 5) * Math.cos(0.2f + (i + 0) / 5) * Math.cos(0.4f + (i + 0) / 2));
        }
        System.out.print("В однопоточном режиме: ");
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void methodB(float[] array) {
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        long b = System.currentTimeMillis();
        System.arraycopy(array, 0, arr1, 0, h);
        System.arraycopy(array, h, arr2, 0, h);

        Thread t1 = new Thread(new MyThread(arr1, 0));
        Thread t2 = new Thread(new MyThread(arr2, h));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr1, 0, array, 0, h);
        System.arraycopy(arr2, 0, array, h, h);

        System.out.print("В двухпоточном режиме: ");
        System.out.println(System.currentTimeMillis() - b);
    }
}
