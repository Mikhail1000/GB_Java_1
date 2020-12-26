package Java_2.lesson_1;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human(1.5, 10000, "Андрей");
        Human human2 = new Human(1.8, 40000, "Антон");
        Cat cat1 = new Cat(0.5, 200, "Барсик");
        Cat cat2 = new Cat(0.8, 500, "Котофеич");
        Robot robot1 = new Robot(2, 15000, "Amazon");
        Robot robot2 = new Robot(1, 10000, "Yandex");
        Wall wall1 = new Wall(1.45);
        Wall wall2 = new Wall(2);
        Treadmill treadmill1 = new Treadmill(8000);
        Treadmill treadmill2 = new Treadmill(20000);
        Treadmill treadmill3 = new Treadmill(500);

        Participant participants[] = {human1, human2, cat1, cat2, robot1, robot2};
        Obstacle obstacles[] = {wall1, wall2, treadmill1, treadmill2, treadmill3};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.start(participant)){
                    break;
                }
            }
        }
        
    }

}
