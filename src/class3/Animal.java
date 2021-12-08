package class3;

public class Animal implements Run, Fly {

    public void walk() {
        System.out.println("Animal is walking with 4 legs");
    }

    public void fly() {
        System.out.println("Animal is flying with wings");
    }
}
