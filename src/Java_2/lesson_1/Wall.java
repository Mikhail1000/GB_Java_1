package Java_2.lesson_1;

public class Wall implements Obstacle {
    protected double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean start(Participant participant) {
        if (participant.jump(height)){
            return true;
        }
        return false;
    }
}
