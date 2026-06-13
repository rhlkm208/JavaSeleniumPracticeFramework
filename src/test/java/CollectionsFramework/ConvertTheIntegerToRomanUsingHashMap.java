package CollectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertTheIntegerToRomanUsingHashMap {

    public static String intToRoman(int num) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(10000, "X̅");
        map.put(9000, "MX̅");
        map.put(5000, "V̅");
        map.put(4000, "MV̅");
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (num >= entry.getKey()) {
                result.append(entry.getValue());
                num = num - entry.getKey();
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(4));     // IV
        System.out.println(intToRoman(3749));  // MMMDCCXLIX
        System.out.println(intToRoman(6749));  // V̅MDCCXLIX
    }
}