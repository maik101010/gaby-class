package class2;

public class Bucles {
    public static void main(String[] args) {
        //while, for, do while
        int i = 0;
        while (i < 10) {
            System.out.println(i); //0,1,2,3,4,5,6,7,8,9
            i++; //add 1 to i
        }
        System.out.println("\nThis is another line");
        for (int variable = 1; variable <= 5; variable++) {
            System.out.println("Value of variable: " + variable);
        }

        System.out.println("\nThis is another line");
        for (int variable = 1; variable <= 61; variable++) {
            variable *= 2;
            System.out.println("Value of variable multiplicative  2: " + variable);
        }
    }
}
