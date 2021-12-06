package class2;

import java.util.ArrayList;
import java.util.List;

public class BuclesWithObjects {
    public static void main(String[] args) {
        Worker worker = new Worker("Michael", 25, 500.0);
        Worker workerTwo = new Worker("Oscar", 30, 500.0);
        Worker workerTree = new Worker("Lucia", 24, 600.0);
        List<Worker> workers = new ArrayList<>();
        workers.add(worker); //0
        workers.add(workerTwo); //1
        workers.add(workerTree); //2
        System.out.println(workers.size());
        //For each
        System.out.println("----For each----");
        for (Worker object : workers) {
            System.out.println(object.getName());
        }
        System.out.println("----Another basic for----");

        //Basic for
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i).getName());
        }

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        //For each
        System.out.println("----For each integers----");
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        List<String> listStrings = new ArrayList<>();
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("For");
        //For each
        System.out.println("----For each strings----");
        for (String object : listStrings) {
//            System.out.println(object.length());
            System.out.println(object);
        }

    }

    static class Worker {
        private String name;
        private int age;
        private double salary;

        public Worker(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }
    }
}
