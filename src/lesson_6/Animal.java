package lesson_6;

public abstract class Animal {
    protected String name;
    protected int distanceRun;
    protected int distanceSwim;
    protected double heightJump;

    public Animal(String name, int distanceRun, int distanceSwim, double heightJump) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        this.heightJump = heightJump;
    }

    public boolean run(int distanceForRun){
        if (distanceForRun <= this.distanceRun){
            System.out.println(this.name + " пробежал!");
            return true;
        }
        System.out.println(this.name + " не смог пробежать :(");
        return false;
    }

    public boolean swim(int distanceForSwim){
        if (distanceForSwim <= this.distanceSwim){
            System.out.println(this.name + " доплыл!");
            return true;
        }
        System.out.println(this.name + " не смог доплыть :(");
        return false;
    }

    public boolean jump(double heightForJump){
        if (heightForJump <= this.heightJump){
            System.out.println(this.name + " перепрыгнул!");
            return true;
        }
        System.out.println(this.name + " не смог перепрыгнуть :(");
        return false;
    }

}
