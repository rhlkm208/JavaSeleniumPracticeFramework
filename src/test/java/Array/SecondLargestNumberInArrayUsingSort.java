package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SecondLargestNumberInArrayUsingSort {

	public static void main(String[] args) {

		// First Method using Arrays.sort()

		int[] arr = { 10, 45, 23, 45, 89, 12 };

		Arrays.sort(arr);

		System.out.println("Second Largest = " + arr[arr.length - 2]);

		// For Long Arrays sorting
		
		Long[] arrLong = { 9333333310L, 3L, 670000L, 87L, 9200L, 45L, 108L };

		Arrays.sort(arrLong, Collections.reverseOrder());
		System.out.println(Arrays.toString(arrLong));

		// Second Method using TreeSet

		int[] arr1 = { 10, 45, 23, 45, 89, 12 };

		TreeSet<Integer> set = new TreeSet<>();

		for (int num : arr1) {
			set.add(num);
		}

		set.pollLast(); // removes largest

		System.out.println("Second Largest = " + set.last());

		int[] arr2 = { 12, 24, 36, 60, 72 };

		Arrays.sort(arr2);

		System.out.println(arr2);
		System.out.println(arr2[arr2.length - 1]);

	}

}
