package TestProgram;

import java.util.regex.Pattern;

public class RecursiveFact {
	
	
	public static void main(String[] args) {
		
		String str = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		String Email = "rhl@test.com";
		Boolean b= Pattern.matches(str, Email);
		
		System.out.println(b);
		
		
	}

}
