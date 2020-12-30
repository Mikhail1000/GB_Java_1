package lesson_7;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cats cat1 = new Cats("Барсик", 10);
        Cats cat2 = new Cats("Мурзик", 12);
        Cats cat3 = new Cats("Чернышь", 5);
        Cats cat4 = new Cats("Пушистик", 7);
        Plates plate = new Plates();

        final int numberDay = 3;
        Random random = new Random();
        Cats catsArr[] = {cat1, cat2, cat3, cat4};

        for (int i = 0; i < numberDay; i++) {
            int numberFoodToday = random.nextInt(40);
            System.out.println("Настал новый день");
            plate.addFood(numberFoodToday);
            for (Cats cat : catsArr) {
                cat.eat(plate);
            }
            System.out.println("День идет к концу");
            plate.printInfo();
            System.out.println();
            Thread.sleep(8000);
        }
    }
}
