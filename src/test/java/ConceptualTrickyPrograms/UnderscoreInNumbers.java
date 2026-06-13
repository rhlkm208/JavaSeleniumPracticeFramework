package ConceptualTrickyPrograms;

public class UnderscoreInNumbers {

	public static void main(String[] args) {

		int i = 0;

		for (; i < 1_0_0;) {
			System.out.println(i);
			i++;
		}
	}
}

/*
 * The loop prints numbers from 0 to 99. 1_0_0 is a numeric literal representing
 * 100, where underscores are used only for readability. Initialization and
 * increment are handled outside the for-loop declaration
 */