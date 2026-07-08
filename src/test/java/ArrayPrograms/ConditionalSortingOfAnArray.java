package ArrayPrograms;

import java.util.Arrays;

public class ConditionalSortingOfAnArray {

	public static void main(String[] args) {
		
		// input - [1,0,1,0,1] 
		// output - [0,0,1,1,1]

		int[] arr = { 1, 0, 1, 0, 1 };

		int zeroCount = 0;

		// Count zeros
		for (int num : arr) {
			if (num == 0) {
				zeroCount++;
			}
		}

		// Fill zeros
		for (int i = 0; i < zeroCount; i++) {
			arr[i] = 0;
		}

		// Fill ones
		for (int i = zeroCount; i < arr.length; i++) {
			arr[i] = 1;
		}

		System.out.println(Arrays.toString(arr));
	}
}