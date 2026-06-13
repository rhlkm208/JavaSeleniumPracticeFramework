package CollectionsFramework;

import java.util.*;

public class FindDuplicateAndUniqueElementsFromList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 5, 6, 9, 9);

		Map<Integer, Integer> map = new HashMap<>();

		// Count occurrences
		for (int num : list) {

			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Integer> duplicates = new ArrayList<>();

		List<Integer> unique = new ArrayList<>();

		// Separate duplicate and unique
		map.forEach((key, value) -> {

			if (value > 1) {

				duplicates.add(key);

			} else {

				unique.add(key);
			}
		});

		System.out.println("Duplicate Elements: " + duplicates);

		System.out.println("Unique Elements: " + unique);
	}
}