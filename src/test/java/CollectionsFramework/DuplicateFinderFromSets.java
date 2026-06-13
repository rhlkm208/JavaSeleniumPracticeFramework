package CollectionsFramework;

import java.util.*;

public class DuplicateFinderFromSets {
    
    public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println(duplicates);
    } 

    public static void findCommon(int[] a, int[] b) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : a) {
            set1.add(num);
        }

        Set<Integer> common = new HashSet<>();
        for (int num : b) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        System.out.println(common);
    }
    
    public static void main(String[] args) {

        int[] s1 = {1, 2, 2, 4, 6, 6};
        int[] s2 = {8, 2, 6, 4, 6, 9, 0, 6};

        // Step 1: Find duplicates in s1
        System.out.println("Duplicates in s1:");
        findDuplicates(s1);

        // Step 2: Find duplicates in s2
        System.out.println("Duplicates in s2:");
        findDuplicates(s2);

        // Step 3: Find common elements between s1 and s2
        System.out.println("Common elements in both:");
        findCommon(s1, s2);
    }

}