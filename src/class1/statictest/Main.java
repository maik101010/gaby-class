package class1.statictest;

public class Main {
    public static void main(String[] args) {
        System.out.println("For the List");
        System.out.println(MyClassWithStaticMethods.getList());
        System.out.println(MyClassWithStaticMethods.getList("Michael"));
        System.out.println(MyClassWithStaticMethods.getList("Michael", "John"));


//        System.out.println("For the String ");
//        System.out.println(MyClassWithStaticMethods.method().hashCode());
//        System.out.println(MyClassWithStaticMethods.method().hashCode());
//        System.out.println(MyClassWithStaticMethods.method().hashCode());
//


//        System.out.println("For the String with non-static method");
//        MyClassWithStaticMethods myClassWithStaticMethods = new MyClassWithStaticMethods();
//        MyClassWithStaticMethods myClassWithStaticMethods2 = new MyClassWithStaticMethods();
//        System.out.println("Reference 1: " + myClassWithStaticMethods);
//        System.out.println(myClassWithStaticMethods.method2().hashCode());
//        System.out.println("Reference 2: " + myClassWithStaticMethods2);
//        System.out.println(myClassWithStaticMethods2.method2().hashCode());


    }
}
