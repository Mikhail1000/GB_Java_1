package Java_2.lesson_1;

public class Cat  implements Participant {
    public double heightMax;
    public int distanceMax;
    public String name;

    public Cat(double heightMax, int distanceMax, String name) {
        this.heightMax = heightMax;
        this.distanceMax = distanceMax;
        this.name = name;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= distanceMax){
            System.out.println(name + " смог пробежать");
            return true;
        }
        System.out.println(name + " не смог пробежать");
        return false;
    }

    @Override
    public boolean jump(double height) {
        if (height <= heightMax){
            System.out.println(name + " смог перепрыгнуть");
            return true;
        }
        System.out.println(name + " не смог перепрыгнуть");
        return false;
    }

}
