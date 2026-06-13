package JavaInterviewLogicalPrograms;

public class StringCompressionProgram2 {

	public static void main(String[] args) {

		String str = "aabbbbccccccc";

		// ── Step 1 — Convert to char array ────────────
		// ── Step 2 — Build result ──────────────────────
		// ── Step 3 — Track visited ─────────────────────
		// 256 = all ASCII characters
		// ── Step 4 — Loop each character ───────────────
		
		char[] chars = str.toCharArray();
		StringBuilder result = new StringBuilder();

		boolean[] visited = new boolean[256];

		for (int i = 0; i < chars.length; i++) {

			if (visited[chars[i]]) {
				continue;
			}

			// Count occurrences
			int count = 0;
			for (int j = i; j < chars.length; j++) {

				if (chars[j] == chars[i]) {
					count++;
				}
			}

			// Mark as visited
			visited[chars[i]] = true;

			// Append char + count
			result.append(chars[i]);
			result.append(count);
		}

		System.out.println("Input  : " + str);
		System.out.println("Output : " + result);
	}
}