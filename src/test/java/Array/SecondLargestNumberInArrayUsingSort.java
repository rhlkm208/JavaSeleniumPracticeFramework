package Array;

import java.util.Arrays;
import java.util.TreeSet;

public class SecondLargestNumberInArrayUsingSort {

	public static void main(String[] args) {

		// First Method using Arrays.sort()

		int[] arr = { 10, 45, 23, 45, 89, 12 };

		Arrays.sort(arr);
		
		System.out.println("Largest Number " + arr[arr.length - 1]);
		System.out.println("Second Largest = " + arr[arr.length - 2]);

		
		// Second Method using TreeSet

		int[] arr1 = { 10, 45, 23, 45, 89, 12 };

		TreeSet<Integer> set = new TreeSet<>();

		for (int num : arr1) {
			set.add(num);
		}

		set.pollLast(); // removes largest

		System.out.println("Second Largest = " + set.last());

	}

}
