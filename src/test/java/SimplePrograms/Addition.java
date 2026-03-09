package SimplePrograms;

public class Addition<a> {

	/*
	 * int a = 10; int b = 20;
	 */
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int sub(int a, int b) {
		int c = b-a;
		return c;
	}

	public static void main(String[] args) {
		
		int results = add(10,20);
		int results1 = sub(10,20);

		System.out.println(results);
		System.out.println(results1);
		
		
		}

}
