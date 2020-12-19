package lesson_6;

public class Cat extends Animal{

    public Cat(String name, int distanceRun, int distanceSwim, double heightJump, boolean specialAbilities) {
        super(name, distanceRun, distanceSwim, heightJump);
        if (distanceRun > 200 && !specialAbilities){
            super.distanceRun = 200;
        }
        if (heightJump > 2 && !specialAbilities){
            super.heightJump = 2;
        }
        if (distanceSwim > 0 && !specialAbilities){
            super.distanceSwim = 0;
        }
    }
}
