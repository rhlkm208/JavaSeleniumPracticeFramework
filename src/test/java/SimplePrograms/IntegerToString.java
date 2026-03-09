package SimplePrograms;

public class IntegerToString {

	public static void main(String[] args) {
		int a = 5000;
		int b = 2000;

		System.out.println("Addition of two numbers = " + (a + b));

		String x = Integer.toString(a);
		String y = Integer.toString(b);

		System.out.println("Addition of two numbers after converting into String= " + (x + y));

		
		String s1 = "1000";
		String s2 = "4000";
		
		System.out.println("Addition of two String = " + (s1 + s2)); 
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		System.out.println("Addition of two String after converting into Integer = " + (n1 + n2));
	}

}
