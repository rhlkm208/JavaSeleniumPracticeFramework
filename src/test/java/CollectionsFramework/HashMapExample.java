package CollectionsFramework;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        
        System.out.println(map);

        map.remove(3);
        
        System.out.println(map);

        System.out.println("Size: " + map.size());

        Integer thirdKey =
            new ArrayList<>(map.keySet()).get(2);

        System.out.println("Third Key: " + thirdKey);
        
        map.remove(thirdKey);

        System.out.println(map);
    }
}
