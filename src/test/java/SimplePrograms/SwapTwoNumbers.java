package SimplePrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		System.out.println("Swapping with using third variable");
		int x = 5;
		int y = 10;

		int temp = x;
		x = y;
		y = temp;

		System.out.println("After Swap -" + x);
		System.out.println("After Swap -" + y);

		System.out.println("Swapping without using third variable");
		int m = 5;
		int n = 10;

		m = m + n;
		n = m - n;
		m = m - n;

		System.out.println("After Swap -" + m);
		System.out.println("After Swap -" + n);
	}

}
