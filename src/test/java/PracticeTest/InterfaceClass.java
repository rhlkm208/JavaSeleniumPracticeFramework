package PracticeTest;

public class InterfaceClass implements InterfaceA, InterfaceB {

	@Override
	public void hello() {
	//	InterfaceA.super.hello();
		System.out.println("Hello");
	}

	@Override
	public void Test() {
		System.out.println("This is an Abstract Method inside the InterfaceA class");
		
	}
	
	public static void main(String[] args) {
		
		InterfaceClass inface = new InterfaceClass();
		inface.hello();
	}

	
}