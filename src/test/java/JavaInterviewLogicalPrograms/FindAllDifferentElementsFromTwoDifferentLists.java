package JavaInterviewLogicalPrograms;

import java.util.*;

public class FindAllDifferentElementsFromTwoDifferentLists {

	public static void main(String[] args) {

		List<String> first = Arrays.asList("ADT", "CNN", "INS", "INF", "UNN", "YTH");
		List<String> second = Arrays.asList("ADT", "CNN", "AAA", "INS", "BBB", "UNN", "YTH", "CCC");

		List<String> diff = new ArrayList<>();

		// Elements in first but not in second
		for (String s : first) {
			if (!second.contains(s)) {
				diff.add(s);
			}
		}

		// Elements in second but not in first
		for (String s : second) {
			if (!first.contains(s)) {
				diff.add(s);
			}
		}

		System.out.println("Different elements: " + diff);
	}
}