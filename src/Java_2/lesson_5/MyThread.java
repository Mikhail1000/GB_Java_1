package Java_2.lesson_5;

import java.util.Arrays;

public class MyThread implements Runnable{
    float[] arr;
    int startPoint;

    public MyThread(float[] arr, int startPoint) {
        this.arr = arr;
        this.startPoint = startPoint;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + startPoint) / 5) * Math.cos(0.2f + (i + startPoint) / 5) * Math.cos(0.4f + (i + startPoint) / 2));
        }
    }
}
