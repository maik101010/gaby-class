package class2;

public class Conditionals {
    public static void main(String[] ars) {
        boolean result = true;
        //Base structure
        if (result) {
            System.out.println("Something");
        }
        //another structure
        if (true)
            System.out.println("Hola mundo");
        else
            System.out.println("Hola mundo in else");

        boolean result2 = false;
        if (result2) {
            System.out.println("Result2 is true");
        } else {
            System.out.println("Result2 is false");
        }

        //if with else if
        int number = 5;
        if (number == 5) { //== != <> ><
            System.out.println("Number is 5");
        } else if (number == 6) {
            System.out.println("Number is 6");
        } else {
            System.out.println("Number is not 5 or 6");
        }

    }
}
