package lesson_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //task 1
        int array[] = {1, 0, 0, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(Arrays.toString(invert_array(array)));

        //task 2
        System.out.println(Arrays.toString(fill_array_arithmetic_progress(3, 8)));

        //task 3
        int array_1[] = {1, 5, 3, 2, 11, 6, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(task3(array_1)));

        //task 4
        print_square_array(fill_diagonal(1, 9));

        //task 5
        int array_2[] = {1, 100, -50, -1, 50, 27, 32, 17, 52, 47, 225, 10};
        print_max_and_min_from_array(array_2);

        //task 6
        int array_3[] = {1, 5, 7, 2, 6, 5};
        equal_half(array_3);

        //task 7
        int array_4[] = {1, 0, 5, 2, 10, 4};
        System.out.println(Arrays.toString(shift_elements_array(array_4, 1)));
    }

    public static int[] invert_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

//    Уж очень напрашивалась арифметическая прогрессия)
    public static int[] fill_array_arithmetic_progress(int delta, int length_array) {
        int array[] = new int[length_array];
        for (int i = 0; i < length_array; i++) {
            array[i] = delta * i;
        }
        return array;
    }

    public static int[] task3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static int[][] fill_diagonal(int filling_element, int side_square) {
        int[][] arr = new int[side_square][side_square];
        for (int i = 0; i < side_square; i++) {
                arr[i][i] = filling_element;
                arr[i][side_square - i - 1] = filling_element;
        }
        return arr;
    }

    public static void print_square_array(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void print_max_and_min_from_array(int[] arr) {
        int max = 10;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальный элемент: " + min + ", " + "максимальный элемент: " + max);
    }

    public static boolean equal_half(int[] arr) {
        int sum_left_half = 0;
        int sum_right_half = 0;
        int half_array = arr.length/2;

        for (int i = 0; i < half_array; i++) {
            sum_left_half += arr[i];
        }
        for (int i = 0; i < half_array; i++) {
            int j = arr.length - i - 1;
            sum_right_half += arr[j];
        }
        if (sum_left_half == sum_right_half) {
            System.out.println("Equal");
            return true;
        }
        System.out.println("Not equal");
        return false;
    }

    public static int[] shift_elements_array(int[] arr, int step) {
        if (step > 0) {
            for (int i = 0; i < step; i++) {
                int temp_start = arr[0];
                for (int j = 0; j < arr.length; j++) {
                    if (j == arr.length - 1) {
                        arr[j] = temp_start;
                        break;
                    }
                    arr[j] = arr[j + 1];
                }
            }
        }
        if (step < 0) {
            for (int i = 0; i > step; i--) {
                int temp_end = arr[arr.length - 1];
                for (int j = 0; j < arr.length; j++) {
                    if (j == arr.length - 1) {
                        arr[0] = temp_end;
                        break;
                    }
                    arr[arr.length - 1 - j] = arr[arr.length - 2 - j];
                }
            }
        }
        return arr;
    }
}

