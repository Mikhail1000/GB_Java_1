package lesson1;

public class Main {

    public static void  main(String[] args) {
        printHelloWorld();

        testVars();
    }

    private static void testVars() {
        int varA;
        varA = 7;
        int varB = 3;
        //double result = 1.0 * (varA / varB);
        double result = (double) varA / varB;
        System.out.println(result);

        double doubleVarA = 7.0;
        double doubleVarB = 3.0;
        double doubleResult = doubleVarA / doubleVarB;
        System.out.println(doubleResult);
    }

    public static void printHelloWorld() {
        System.out.println("Hello, world!");
    }
}
