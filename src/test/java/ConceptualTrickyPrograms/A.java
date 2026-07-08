package ConceptualTrickyPrograms;

public class A {
	void test(Object o) {
		System.out.println("Object");
	}

	
	void test(String s) {
		System.out.println("String");
	}

	
	/*
	 * void test(Integer i) { 
	 * System.out.println("Integer"); 
	 * }
	 */
			
	public static void main(String[] args) {
		A a = new A();
		a.test(null);
	}
}