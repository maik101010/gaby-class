package operations;

public class Main {
    public static void main(String[] args) {
        double numberOne = 2.0;
        double numberTwo = 3.0;
        System.out.println("First call to instance of the object MathOperations");
        MathOperations mathOperations = new MathOperations(numberOne, numberTwo);
        mathOperations.doOperations();
        System.out.println("Second call to another instance of the object MathOperations");
        MathOperations mathOperationsAnother = new MathOperations();
        mathOperationsAnother.doOperations();
        System.out.println("Multiply values: " + mathOperationsAnother.multiplyValues());

        String name = "Michael";
        System.out.println(mathOperations.greeting(name));
        name = "Gaby";
        System.out.println(mathOperations.greeting(name));
        name = "Michael" + " y " + "Gaby";
        System.out.println(mathOperations.greeting(name));

    }
}
