package Java_1.lesson_7;

public class Plate {
    private int food;

    public void addFood(int food) {
        this.food += food;
        System.out.println("Теперь в миске " + this.food + " еды");
    }

    public void printInfo(){
        System.out.println("Сейчас в миске: " + food + " еды");
    }

    public boolean decreaseFood(int appetiteCat) {
        if (appetiteCat <= this.food){
            this.food -= appetiteCat;
            return true;
        }
        return false;
    }
}
