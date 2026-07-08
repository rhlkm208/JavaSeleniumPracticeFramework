package CollectionsFramework;

import java.util.*;

public class FindAllDifferentElementsFromTwoDifferentListsUsingSet {

	public static void main(String[] args) {

		List<String> first = Arrays.asList("ADT", "CNN", "INS", "INF", "UNN", "YTH");
		List<String> second = Arrays.asList("ADT", "CNN", "AAA", "INS", "BBB", "UNN", "YTH", "CCC");

		Set<String> set1 = new HashSet<>(first);
		Set<String> set2 = new HashSet<>(second);

		Set<String> diff = new HashSet<>(set1);
		diff.addAll(set2);

		Set<String> common = new HashSet<>(set1);
		common.retainAll(set2);

		diff.removeAll(common);

		System.out.println("Different elements: " + diff);
	}
}