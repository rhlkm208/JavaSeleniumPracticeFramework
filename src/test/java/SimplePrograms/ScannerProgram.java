package SimplePrograms;

import java.util.Scanner;

public class ScannerProgram {
	
	public static void add() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println(c);
		
		sc.close();
		
	}

	public static void main(String[] args) {
		ScannerProgram.add();
	}

}
