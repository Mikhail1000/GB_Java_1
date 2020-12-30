package Java_2.lesson_2;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"2", "55", "17", "0sdf"}, {"2", "55", "17kl", "0"}, {"2", "55", "17", "0"}, {"2", "55", "17", "0"}};

            System.out.println("Сумма = " + sumStringItem(array));
    }


    public static int sumStringItem(String[][] arr) {
        try {
            checkDimensionsArray(arr);
        } catch (MyArraySizeException e) {
            System.err.println("На вход нужно подавать массив размером 4х4");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                try {
                    sum += parseStringToInt(arr[i][j]);
                } catch (MyArrayDataException e) {
                    System.err.println("Данные в ячейке с индексами [" + i + "]" + "[" + j + "] невозможно привести к типу int");
                }
            }

        }
        return sum;
    }

    public static void checkDimensionsArray(String[][] arr){
        if (arr.length != 4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length != 4){
                throw new MyArraySizeException();
            }
        }
    }

    public static int parseStringToInt(String str) throws MyArrayDataException{
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException();
        }
    }

}
