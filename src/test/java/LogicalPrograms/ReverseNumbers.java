package LogicalPrograms;

public class ReverseNumbers {

	public static void main(String[] args) {

		

//		1st Method
		int number = 1992;
		int rev = 0;

		while (number != 0) {

			int rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;

		}

		System.out.println(rev);

//		2nd Method 
		
		int num = 2002;
		int original = num;
		int dummy = 0;
		while (num != 0) {
			int rem = num % 10;
			dummy = (dummy * 10) + rem;
			num = num / 10;
		}
		System.out.println("Number = " + original);
		System.out.println("Dummy = " + dummy);

		if (original == dummy) {
			System.out.println("It's Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
