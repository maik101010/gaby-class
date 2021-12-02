package classe1.operations;

public class MathOperations {
    private double numberOne;
    private double numberTwo;

    //Initialized variables of the own class, return nothing
    public MathOperations(double paramNumberOne, double paramNumberTwo) {
        this.numberOne = paramNumberOne;
        this.numberTwo = paramNumberTwo;
    }

    //constructor with default values
    public MathOperations() {
        //parameters default
        this.numberOne = 1.0;
        this.numberTwo = 1.0;
    }

    //Method for addition the values, return a double
    public double sumValues() {
        return this.numberOne + this.numberTwo + this.sumOneMoreValue() + this.leftOneValue();
        //(3+2+1+-1);
    }

    public double multiplyValues() {
        return this.numberOne * this.numberTwo;
    }

    protected double sumOneMoreValue() {
        return +1;
    }

    private double leftOneValue() {
        return -1;
    }

    protected void doOperations() {
        System.out.println("My public method with value of sum is: " + sumValues());
        System.out.println("My protected method with value adding one: " + sumOneMoreValue());
        System.out.println("My private method with value left one: " + leftOneValue());
    }

    public String greeting(String name) {
        return "Hello " + name;
    }
}
