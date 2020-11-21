package lesson_1;

public class Main {


    public static void main(String[] args) {
        byte varA = 120;
        short varB = 2000;
        int varC = 10000;
        long varD = 1000000;
        float varE = 2.5f;
        double varF = 10.2513;
        char varG = 200;
        boolean varH = true;
        String str = "Hello world!";
        System.out.println(task_3(1, 2, 3, 4));
        System.out.println(task_4(2, 15));
        System.out.println(task_5(2));
        System.out.println(task_6(-50));
        System.out.println(task_7("Михаил"));
        System.out.println(task_8(2008));
        System.out.println(task_8(2005));
        System.out.println(task_8(2000));
        System.out.println(task_8(100));
    }

    public static double task_3(double a, double b, double c, double d){
        return a * (b + (c/d));
    }

    public static boolean task_4(int a, int b){
        return ((a + b) <= 20 & (a + b) >= 10);
    }

    public static String task_5(int a){
        if (a >= 0){
            return "Введенное число положительное";
        }
        return "Введенное число отрицательное";
    }

    public static boolean task_6(int a){
        return a < 0;
    }

    public static String task_7(String name){
        return "Привет, " + name + "!";
    }

    public static String task_8(int a){
        if (a % 4 == 0 & a % 100 != 0){
            return "Год високосный";
        }
        if (a % 400 == 0){
            return "Год високосный";
        }
        return "Год не високосный";
    }
}
