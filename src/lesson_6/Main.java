package lesson_6;

public class Main {
    public static void main(String[] args) {
        //при создании нового объекта ему указываются его предельные значения по бегу, плаванию и прыжкам
        //если specialAbilities = true, значит у животного есть особые способности, и для него ограничение из задания не действуют
        Cat cat1 = new Cat("Барсик",300,  2, 1, false);
        Dog dog1 = new Dog("Мухтар",700, 5, 0.5, false);

        cat1.jump(1);
        dog1.jump(0.3);
        cat1.swim(2);
        dog1.swim(5);
        cat1.run(300);
        dog1.run(600);
    }
}
