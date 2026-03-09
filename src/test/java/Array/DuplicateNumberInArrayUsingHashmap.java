package Array;

import java.util.HashMap;

public class DuplicateNumberInArrayUsingHashmap {

	public static void main(String[] args) {

		int[] a = { 58, 55, 56, 58 };

		HashMap<Integer, Integer> map = new HashMap<>();

		// Count occurrences
		for (int num : a) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		System.out.println("Duplicate numbers are:");

		// Print duplicates
		map.forEach((key, value) -> {
			if (value > 1) {
				System.out.println(key + " -> " + value + " times");
			}
		});

	}
}
