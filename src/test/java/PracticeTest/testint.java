package PracticeTest;

import java.util.HashSet;

public class testint {

	public static void main(String[] args) {

		String[] first = { "ADT", "CNN", "INS", "INF", "UNN", "YTH" };
		String[] second = { "ADT", "CNN", "AAA", "INS", "BBB", "UNN", "YTH", "CCC" };

		HashSet<String> hs1 = new HashSet<>();
		HashSet<String> hs2 = new HashSet<>();
		HashSet<String> hs3 = new HashSet<>();

		for (String fir : first) {
			if (!hs2.contains(fir)) {
				hs3.add(fir);
			}

			for (String sec : second) {
				if (!hs1.contains(sec)) {
					hs3.add(sec);
				}
			}

			System.out.println(hs3);
		}
	}
}
