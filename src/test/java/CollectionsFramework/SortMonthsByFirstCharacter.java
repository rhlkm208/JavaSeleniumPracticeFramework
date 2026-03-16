package CollectionsFramework;

import java.util.*;

public class SortMonthsByFirstCharacter {
    public static void main(String[] args) {

        List<String> months = Arrays.asList(
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        );

        Collections.sort(months, (a, b) -> 
            Character.compare(a.charAt(0), b.charAt(0))
        );

        System.out.println(months);
    }
}

