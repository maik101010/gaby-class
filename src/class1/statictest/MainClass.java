package class1.statictest;

//One main class can have static methods
public class MainClass {
    private static String var = "My variable";

    public void callInternClass() {
        System.out.println(OtherClass.getValue());
        System.out.println(OtherClass.getValue());
        System.out.println(OtherClass.VALUE);
    }

    //One class with static keyword must have static methods
    public static class OtherClass {
        private static int value = 1;
        public static String VALUE = "My value";

        public static int getValue() {
            return value;
        }
    }

    public class OtherClassWithoutStatic {
        //non compile when the class is intern with static variables or methods
        //private static String value = "";
        private int value = 1;
        public String VALUE = "My value";

        public int getValue() {
            return value;
        }

    }
}
