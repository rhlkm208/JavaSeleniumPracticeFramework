package JavaInterviewLogicalPrograms;

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
		
		System.out.println("Enter String");
		String str = sc.next();
		
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		
		System.out.println("Concatinated String and Char Together");
		String res = str+ch;
		System.out.println(res);
		
		sc.close();
		
	}

	public static void main(String[] args) {
		ScannerProgram.add();
	}

}
