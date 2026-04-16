package JavaInterviewLogicalPrograms;

public class Pattern {

	public static void main(String[] args) {

		for (int i=0; i<5; i++) {
			for (int j=i; j<5; j++)

				System.out.print("*");
			System.out.println();

		}

		//int rows = 5;

		// Outer loop controls rows
		for (int i=0; i<5; i++) {

			// Inner loop prints stars
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}

			// Move to next line after each row
			System.out.println();
		}
		
		/*
		 * for (int i=0; i<5; i++) { for (int j=i; j<5; j++)
		 * 
		 * System.out.print("*"); System.out.println();
		 * 
		 * }
		 */
		
	}

}
