package class4;

import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
        //Map, List, Set
        //Map[key, value] = {"1", "mi valor"},{2, "mi valor2"}, [1, "mi valor1"], [2, "mi valor2"]
        //List<String> = ["1", "2", "3", "1"];//1,2,3,1
        //Set<String> = ["1", "2", "3", "1"]; //1,2,3
        Map<String, Integer> map = new HashMap<>();
        map.put("key-1", 100);
        map.put("key-2", 110);
        map.put("key-3", 122);

//        System.out.println(map.get("key-1"));
//        System.out.println(map.get("key-123123"));
//        System.out.println(map.containsKey("key-3"));
//        System.out.println(map.size());
        // for map java 7
        System.out.println("Print map");
        for (Map.Entry<String, Integer> object : map.entrySet()) {
            System.out.println(object.getKey() + ": " + object.getValue());
        }
        System.out.println("Print List");
        // for list java 7
        List<String> list = Arrays.asList("1", "2", "3", "1", "3");
        for (String value : list) {
            System.out.println(value);
        }
        System.out.println("Print Set");
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(3);
        for (Integer value : set) {
            System.out.println(value);
        }

        //Convert list to map



    }
}
