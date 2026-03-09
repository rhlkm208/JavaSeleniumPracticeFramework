package JavaInterviewLogicalPrograms;

import java.util.Scanner;

public class PrimeNumberUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		int num = sc.nextInt();

		boolean isPrime = true;
		
		System.out.println(num/2);
		System.out.println(num%2);
		

		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= num ; i++) {

				if (num % i == 0) {

					isPrime = false;
					break;
				}

			}

		}
		
		if(isPrime) {
			System.out.println(num + " is a Prime");
		}
		else {
			System.out.println(num + " is not a Prime");
		}

		sc.close();
	}
}
