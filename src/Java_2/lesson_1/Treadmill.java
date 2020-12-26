package Java_2.lesson_1;

public class Treadmill implements Obstacle {
    protected int length;

    public Treadmill(int length) {
        this.length = length;
    }


    @Override
    public boolean start(Participant participant) {

        if (participant.run(length)){

            return true;
        }

        return false;
    }
}
