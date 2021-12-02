import nuevo.MyFirstClass;
import operations.MathOperations;

public class AnotherDistinctClass {
    public static void main(String[] args) {
        MyFirstClass.AnotherClass myVarInstance = new MyFirstClass.AnotherClass();
        myVarInstance.setVarName(50);
        System.out.println("My current value is: " + myVarInstance.getVarName());
        System.out.println("My current value plus 10 is: " + myVarInstance.getVarNamePlusTen());
        System.out.println("My current value multiplication of 10 is: " + myVarInstance.getVarNameMultiplicationOfTen());

        MathOperations mathOperations = new MathOperations(5.0, 3.0);
        System.out.println("The sum is: " + mathOperations.sumValues());
        //I can't use this method in this package because is a protected method
//        mathOperations.sumOneMoreValue();
    }
}
