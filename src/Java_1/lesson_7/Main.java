package Java_1.lesson_7;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Барсик", 10);
        Cat cat2 = new Cat("Мурзик", 12);
        Cat cat3 = new Cat("Черныш", 5);
        Cat cat4 = new Cat("Пушистик", 7);
        Plate plate = new Plate();

        final int numberDay = 3;
        Random random = new Random();
        Cat catsArr[] = {cat1, cat2, cat3, cat4};

        for (int i = 0; i < numberDay; i++) {
            int numberFoodToday = random.nextInt(40);
            System.out.println("Настал новый день");
            plate.addFood(numberFoodToday);
            for (Cat cat : catsArr) {
                cat.eat(plate);
            }
            System.out.println("День идет к концу");
            plate.printInfo();
            System.out.println();
            Thread.sleep(8000);
        }
    }
}
