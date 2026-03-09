package JavaInterviewLogicalPrograms;

import java.util.Scanner;

public class FibonacciProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:-");
		int num = sc.nextInt();
		sc.close();

		int a = 0;
		int b = 1;
		int temp = 0;

		System.out.print(a + " " + b);
		
		for (int i = 2; i < num; i++) {
			temp = a + b;
			System.out.print(" " + temp);
			a = b;
			b = temp;
		}

	}

}
