package OOPSConcept;

public class PublicPrivate {

	public int a=20;
	int b = 30;
	private int c = 40;
	private int d = 50;
	
	public void add() {
		int sum = a+b;
		System.out.println("Sum is: " + sum);
		multiply();
		
	}
	
	private void multiply() {
		int mul = c*d;
		System.out.println("Multiplication is: " + mul);
	}
	
}
