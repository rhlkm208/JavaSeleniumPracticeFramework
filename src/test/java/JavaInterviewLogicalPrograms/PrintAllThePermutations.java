package JavaInterviewLogicalPrograms;

public class PrintAllThePermutations {

	// ── Core recursive method ──────────────────────────
	public static void permutations(String str, int left, int right) {

		// Base case — one permutation complete
		if (left == right) {
			System.out.println(str);
			return;
		}

		// Fix one character and
		// permute rest
		for (int i = left; i <= right; i++) {

			// Step 1 — Swap character
			// at left with i
			str = swap(str, left, i);

			// Step 2 — Recurse for
			// remaining characters
			permutations(str, left + 1, right);

			// Step 3 — Swap back
			// (backtrack)
			str = swap(str, left, i);
		}
	}

	// ── Swap two characters ────────────────────────────
	public static String swap(String str, int i, int j) {

		char[] chars = str.toCharArray();

		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;

		return new String(chars);
	}

	// ── Main ──────────────────────────────────────────
	public static void main(String[] args) {

		String str = "ABC";

		System.out.println("String: " + str);
		System.out.println("All Permutations:");
		System.out.println("──────────────────");

		permutations(str, 0, str.length() - 1);
	}
}
