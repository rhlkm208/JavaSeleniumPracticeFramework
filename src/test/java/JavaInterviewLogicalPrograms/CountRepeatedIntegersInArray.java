package JavaInterviewLogicalPrograms;

import java.util.Arrays;

public class CountRepeatedIntegersInArray {

	public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 3, 3, 5, 1};

        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("\nRepeated Integers:");

        // Outer loop — pick each element
        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            // Inner loop — compare with rest
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Print only if repeated
            if (count > 1) {
                System.out.println(
                    arr[i]
                    + " → repeated "
                    + count
                    + " times");
            }
        }
	}
}

/*
 * ### Output: Input Array: [1, 2, 3, 2, 4, 3, 3, 5, 1]
 * 
 * Repeated Integers: 1 → repeated 2 times 2 → repeated 2 times 3 → repeated 3
 * times
 */