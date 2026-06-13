package PracticeTest;

import java.time.LocalDate;

public class Test21 {
	
	int a = 125;
	byte b = 127;
	byte c = 127;
	
	int d = b+c;
	

	public static void main(String[] args) {
		
		float f1 = 35E3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);
		
		// Set the maximum possible score in the game to 500
		int maxScore = 500;

		// The actual score of the user
		int userScore = 423;

		/* Calculate the percentage of the user's score in relation to the maximum available score.
		Convert userScore to double to make sure that the division is accurate */
		double percentage = (double) userScore / maxScore * 100;

		System.out.println("User's percentage is " + percentage);
		
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("where")); // Outputs 7

 double num = Math.random()*100;
 System.out.println(num);
 
 int time = 20;
 String result = (time < 28) ? "Good day." : "Good evening.";
 System.out.println(result);

 
 
	}

}
