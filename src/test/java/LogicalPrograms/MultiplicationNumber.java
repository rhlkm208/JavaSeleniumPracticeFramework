package LogicalPrograms;

import java.util.Scanner;

public class MultiplicationNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number For Multiplication Table");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(num + " x " + i + " = " + result);
		}

	}
}
