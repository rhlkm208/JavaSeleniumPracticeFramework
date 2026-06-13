package CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbersinArrayUsingSet {
    public static void main(String[] args) {

        int[] a = {58, 55, 56, 58, 55, 55, 98, 68};

        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (int num : a) {
            // add() returns false if element already exists
            if (!uniqueNumbers.add(num)) {
                duplicateNumbers.add(num);
            }
        }

        System.out.println("Duplicate numbers are:");
        for (int dup : duplicateNumbers) {
            System.out.println(dup);
        }
    }
}

