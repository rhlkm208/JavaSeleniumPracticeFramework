package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WAPToFindTheKthLargestAndSmallestNumberInArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 34, 11, 34, 57, 89, 45, 56, 89);
        
        // 1. Sort the list in ascending order
        Collections.sort(arr); // [11, 12, 34, 34, 45, 56, 57, 89, 89]
        
        int k = 3; // Let's find the 3rd smallest and 3rd largest
        
        int kthSmallest = arr.get(k - 1);
        int kthLargest = arr.get(arr.size() - k);
        
        System.out.println(k + "rd Smallest (with duplicates): " + kthSmallest); // Output: 34
        System.out.println(k + "rd Largest (with duplicates): " + kthLargest);   // Output: 57
    }
}
