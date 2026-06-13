package ConceptualTrickyPrograms;

public class ConstructorClass {
	
	ConstructorClass() {
		this(10);
	}
	
	public ConstructorClass(int x) {
		System.out.println(x);
	}

	public void test(int x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		ConstructorClass cc = new ConstructorClass();
		//cc.test(20);
	}

}
