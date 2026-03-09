package LogicalPrograms;

public class TestProgNew {

	public void palindrome() {
		String str = "Madam";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			rev = rev + str.charAt(i);

		}

		System.out.println("");
		System.out.println(rev);

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("It's palindrome");
		} else {
			System.out.println("It's not palindrome");
		}
	}

	public void Fibonacci() {

		int num = 20;
		int a = 0;
		int b = 1;
		int temp = 0;

		System.out.println("Fibonacci Series:-");
		System.out.print(a + "," + b + ",");

		for (int j = 2; j <= num; j++) {

			temp = a + b;
			System.out.print(temp + ",");
			a = b;
			b = temp;
		}
	}

	public void Fibonaccione() {
		int num1 = 30;
		int first = 0, second = 1;
		
		System.out.println("\nFibonacci Series:-");
		System.out.print(first + " " + second);

		for (int i = 3; i <= num1; i++) {
			int next = first + second;
			System.out.print(" " + next);
			first = second;
			second = next;
		}
	}

	public void Fibonaccitwo() {

		int num2 = 10;
		int m = 1;
		int n = 1;
		int f = 0;
		
		System.out.println("\nFibonacci Series:-");
		System.out.print(m + " ");
		System.out.print(n + " ");

		while (f <= num2) {
			f = m + n;
			if (f > num2)
				break;
			System.out.print(f + " ");
			m = n;
			n = f;
		}
	}

	public static void main(String[] args) {
		TestProgNew testProg = new TestProgNew();
		testProg.palindrome();
		testProg.Fibonacci();
		testProg.Fibonaccione();
		testProg.Fibonaccitwo();

	}

}
