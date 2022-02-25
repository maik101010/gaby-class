package class4;

import java.util.*;
import java.util.stream.Collectors;

public class DataStructures2 {
    public static void main(String[] args) {
        List<Animal> animals = Arrays
                .asList(new Animal(1, "Lion", 30),
                        new Animal(2, "Tiger", 30),
                        new Animal(3, "Elephant", 400),
                        new Animal(4, "Giraffe", 50),
                        new Animal(5, "Hippo", 300));
        //java 8
        animals.forEach(System.out::println);
//        its the same as, java 7
//        for (Animal animal : animals) {
//            System.out.println(animal);
//        }
        System.out.println("Set list of animals in Map");
        Map<Integer, Animal> mapReturn = getMapFromListOfAnimals(animals);
        //java 8
        mapReturn.forEach((k, v) -> System.out.println(k + "-" + v));
        // java 7
//        for (Map.Entry<Integer, Animal> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
    //java 7
//    static private Map<Integer, Animal> getMapFromListOfAnimals(List<Animal> animals) {
//        Map<Integer, Animal> map = new HashMap<>();
//        for (Animal animal : animals) {
//            map.put(animal.getId(), animal);
//        }
//        return map;
//    }
    //java 8
    static private Map<Integer, Animal> getMapFromListOfAnimals(List<Animal> animals) {
        return animals.stream()
//                .collect(Collectors.toMap(objet -> objet.getId(), animal -> animal));
                .collect(Collectors.toMap(Animal::getId, animalObject -> animalObject));
    }
}
