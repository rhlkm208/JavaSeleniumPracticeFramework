package PracticeTest;

public interface InterfaceA {

	int a = 10;
	String str = "Rahul";
	
	public void hello();
	public abstract void Test();
	
	default void defaultMethod() {
		
	}
}
