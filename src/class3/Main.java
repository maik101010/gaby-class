package class3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.walk();
//        Animal animal = new Animal();
//        animal.walk();
//        People people = new People();
//        people.walk();
//        System.out.println("----With interfaces-----");
//        Run car1 = new Car();
//        car1.walk();
//
//        Run animal1 = new Animal();
//        animal1.walk();
//
//        Run people1 = new People();
//        people1.walk();


//        Run runInterface = new Car();
//        runInterface.walk();
//        runInterface = new Animal();
//        runInterface.walk();
//        runInterface = new People();
//        runInterface.walk();


        Run runInterface1 = new Animal();
        runInterface1.walk();
        Fly animalFlying = new Animal();
        animalFlying.fly();

    }
}
