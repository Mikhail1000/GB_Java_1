package Java_1.lesson_11_generics;

public class Apple extends Fruit{
    private static final float WEIGHT = 1.0f;

    public Apple() {
        super(WEIGHT);
    }

    public static float getWeightApple() {
        return WEIGHT;
    }
}
