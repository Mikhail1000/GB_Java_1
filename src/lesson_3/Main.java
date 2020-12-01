package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean game_over = true;
        while (game_over) {
            game_over = guess_number();
        }

        guess_word();
    }

    private static boolean guess_number() {
        Scanner scanner = new Scanner(System.in);

        int number_try = 3;
        Random random = new Random();
        int random_number = random.nextInt(10);

        System.out.println("Угадайте число от 0 до 9 включительно");

        for (int i = 0; i < number_try; i++) {
            int user_answer = scanner.nextInt();
            if (user_answer == random_number) {
                System.out.println("Поздравляю, Вы выиграли!");
                System.out.println("Повторить игру еще раз? 1 - да/0 - нет");

                return 1 == scanner.nextInt();
            }
            else {
                if (user_answer > random_number) {
                    System.out.println("Загаданное число меньше");
                }
                else {
                    System.out.println("Загаданное число больше");
                }
            }
        }
        System.out.println("Вы проиграли.");
        System.out.println("Повторить игру еще раз? 1 - да/0 - нет");
        return 1 == scanner.nextInt();
    }

    private static void guess_word() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",                         "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",                                 "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);
        int number_symbol_in_str = 15;
        Random random = new Random();
        int random_number = random.nextInt(words.length - 1);
        String guessed_word = words[random_number];
        char[] string_for_user = new char[15];
        System.out.println("Угадайте загаданное английское слово");

        String user_answer = scanner.nextLine().toLowerCase();

        while (!(user_answer.equals(guessed_word))) {
            for (int i = 0; i < number_symbol_in_str; i++) {
                if (i < guessed_word.length() & i < user_answer.length()) {
                    char a = guessed_word.charAt(i);
                    if (a == user_answer.charAt(i)){
                        string_for_user[i] = a;
                    }
                    else {
                        string_for_user[i] = '#';
                    }
                }
                else{
                    string_for_user[i] = '#';
                }

            }
            for (char c : string_for_user) {
                System.out.print(c);
            }
            System.out.println();

            user_answer = scanner.nextLine().toLowerCase();
        }
        System.out.println("Поздравляю, Вы выиграли!");
    }

}

