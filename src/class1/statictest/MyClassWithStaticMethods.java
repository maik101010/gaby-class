package class1.statictest;

import java.util.ArrayList;
import java.util.List;

public class MyClassWithStaticMethods {
    private static ArrayList<String> list;

    static {
        //we create a new instance of the list, only one instance is created
        list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
    }

    //we are override getList method
    public static List<String> getList(String anyString) {
        list.add(anyString);
        return list;
    }

    public static List<String> getList(String anyString, String anyString2) {
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
        list.add(anyString);
        list.add(anyString2);
        return list;
    }

    public static List<String> getList() {
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
        return list;
    }

    public static String method() {
        return "Anything";
    }

    public String method2() {
        return "Anything2";
    }

    public String method2(String anyString) {
        return "Anything2" + anyString;
    }
}
