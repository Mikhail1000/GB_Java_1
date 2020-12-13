package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class lesson_4 {

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final String HEADER_FIRST_EMPTY = "♥";
    static final String EMPTY = " ";

    static final Scanner in = new Scanner(System.in);
    static int sizeMap;
    static char[][] mapGame;
    static final Random random = new Random();
    

    public static void main(String[] args) {
        onGame();
    }

    private static void onGame() {
        initMap();

        printMap();

        playGame();
    }

    public static void initMap() {
        System.out.println("Введите размер игрового поля");
        sizeMap = in.nextInt();
        mapGame = new char[sizeMap][sizeMap];
        for (int i = 0; i < sizeMap; i++) {
            for (int j = 0; j < sizeMap; j++) {
                mapGame[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();

        printMapRow();
    }

    private static void printMapHeader() {
        System.out.println();
        System.out.print(HEADER_FIRST_EMPTY + EMPTY);
        for (int i = 0; i < sizeMap; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRow() {
        for (int i = 0; i < sizeMap; i++) {
            printMapNumber(i);
            for (int j = 0; j < sizeMap; j++) {
                System.out.print(mapGame[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame() {

        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);
        }
    }

    private static void humanTurn() {
        int rowNumber = 0;
        int columnNumber = 0;

        System.out.println("\nХод человека! Введите номера строки и столбца!");

        do {
            System.out.print("Строка = ");
            if (in.hasNextInt()) {
                rowNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число в диапазоне от 1 до " + sizeMap + "\n");
                continue;
            }

            System.out.print("Столбик = ");
            if (in.hasNextInt()) {
                columnNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число в диапазоне от 1 до " + sizeMap + "\n");
                continue;
            }

        } while (!isCellValid(rowNumber, columnNumber));

        mapGame[rowNumber - 1][columnNumber - 1] = DOT_HUMAN;
    }

    private static boolean isCellValid(int rowNumber, int columnNumber) {
        return isCellValid(rowNumber, columnNumber, false);
    }

    private static boolean isCellValid(int rowNumber, int columnNumber, boolean isAI) {
        if (!isAI && (rowNumber < 1 || rowNumber > sizeMap || columnNumber < 1 || columnNumber > sizeMap)) {
            System.out.println("\nПроверьте значение строки и столбца");
            return false;
        }
        // occupancy

        if (mapGame[rowNumber - 1][columnNumber - 1] != DOT_EMPTY) {
            if (!isAI) {
                System.out.println("\nВы выбрали занятую ячейку");
            }
            return false;
        }

        return true;
    }

    private static void checkEnd(char symbol) {
        boolean isEnd = false;

        if (checkWin(symbol)) {
            String winMessage;

            if (symbol == DOT_HUMAN) {
                winMessage = "Ура! Мы победили!";
            }
            else {
                winMessage = "Восстание близко. AI победил.";
            }

            isEnd = true;
            System.out.println(winMessage);
        }

        if(!isEnd && isMapFull()){
            System.out.println("Ничья!");
            isEnd = true;
        }

        if (isEnd) {
            System.exit(0);
        }

    }

    private static boolean checkWin(char symbol) {
        int rowSymbolCount = 0;
        int colSymbolCount = 0;
        for (int i = 0; i < sizeMap; i++) {
            for (int j = 0; j < sizeMap; j++){
                if (mapGame[i][j] == symbol) {
                    rowSymbolCount++;
                }
                if (mapGame[j][i] == symbol) {
                    colSymbolCount++;
                }
            }
            if (rowSymbolCount == sizeMap || colSymbolCount == sizeMap) return true;
            rowSymbolCount = 0;
            colSymbolCount = 0;
        }
        //проверка диагоналей
        for (int i = 0; i < sizeMap; i++) {
            if (mapGame[i][i] == symbol){
                rowSymbolCount++;
            }
            if (mapGame[i][sizeMap - i - 1] == symbol){
                colSymbolCount++;
            }
        }
        if (rowSymbolCount == sizeMap || colSymbolCount == sizeMap) return true;

        return false;
    }

    private static boolean isMapFull() {
        for (char[] chars : mapGame) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    private static void aiTurn() {
        int rowNumber;
        int columnNumber;
        System.out.println("\nХод компютера\n");
        do {
            rowNumber = random.nextInt(sizeMap) + 1;
            columnNumber = random.nextInt(sizeMap) + 1;
        } while (!isCellValid(rowNumber, columnNumber, true));

        mapGame[rowNumber - 1][columnNumber - 1] = DOT_AI;
    }



}
