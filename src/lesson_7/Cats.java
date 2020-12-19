package lesson_7;

public class Cats {

    private String name;
    protected int appetite;
    protected boolean satiety;

    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plates plate) {
        satiety = plate.decreaseFood(this.appetite);
        if (satiety){
            System.out.println("Кот " + this.name + " поел и сыт.");
        }
        else {
            System.out.println("Кот " + this.name + " остался голоден. Для него в миске недостаточно еды.");
        }
    }
}
