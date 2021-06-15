package Java_1.lesson_11_generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(int numberFruit, T typeFruit) {
        for (int i = 0; i < numberFruit; i++){
            this.fruits.add(typeFruit);
        }
    }

    public float getWeight() {
        if (this.fruits.size() == 0) {
            return 0F;
        }
        return this.fruits.get(0).getWeight() * this.fruits.size();
    }

    public boolean compare(Box<? extends Fruit> secondBox) {
        return getWeight() == secondBox.getWeight();
    }

    public void moveContentInOtherBox(Box<T> otherBox) {
        otherBox.addFruit(fruits.size(), fruits.get(0));
        this.fruits.clear();
    }
}
