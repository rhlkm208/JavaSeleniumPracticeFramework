package CollectionsFramework;
import java.util.Map;
import java.util.HashMap;

public class DuplicateValueCountUsingHashMap {

    public static void main(String[] args) {

        // Original Map
        Map<String, String> map = new HashMap<>();

        map.put("a", "Ram");
        map.put("b", "Bob");
        map.put("c", "Cat");
        map.put("d", "Ram");

        // Count occurrences of values
        Map<String, Integer> countMap = new HashMap<>();

        for (String value : map.values()) {

            if (countMap.containsKey(value)) {
                countMap.put(value, countMap.get(value) + 1);
            } else {
                countMap.put(value, 1);
            }
        }
        
        countMap.forEach((key, value)->{
        	if(value>1) {
        		System.out.println(key + " repeated: " + value);
        	}
        });
        
        // Print duplicate values only
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() +
                        " repeated " + entry.getValue() + " times");
            }
        }

    }
}