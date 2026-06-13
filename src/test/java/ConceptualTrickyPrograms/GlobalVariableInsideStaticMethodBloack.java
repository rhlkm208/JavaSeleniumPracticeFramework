package ConceptualTrickyPrograms;

public class GlobalVariableInsideStaticMethodBloack {
	int num1 = 10;

	// Problem Statement - resolve the num1 error and perform the Addition
	// We can not call the non-static variable inside the static method block.
	public static void sum(int num2) {
//		int sum = num1 + num2;
//		System.out.println(sum);
	}

	// Solution 1 :- Access through Object || Call the variable with class Object
	public static void sum1(int num2) {
		int sum = new GlobalVariableInsideStaticMethodBloack().num1 + num2;
		System.out.println(sum);
	}

	// Solution 2 :- make the variable static and then Call the variable directly
	// inside the static method
	public static int n1 = 10;

	public static void sum2(int n2) {
		int sum = n1 + n2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sum(5);
	}
}
