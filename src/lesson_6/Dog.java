package lesson_6;

public class Dog extends Animal{

    public Dog(String name, int distanceRun, int distanceSwim, double heightJump, boolean specialAbilities) {
        super(name, distanceRun, distanceSwim, heightJump);
        if (distanceRun > 500 && !specialAbilities){
            super.distanceRun = 500;
        }
        if (heightJump > 0.5 && !specialAbilities){
            super.heightJump = 0.5;
        }
        if (distanceSwim > 10 && !specialAbilities){
            super.distanceSwim = 10;
        }
    }
}
