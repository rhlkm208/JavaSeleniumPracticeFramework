package ConceptualTrickyPrograms;

public class MethodChainingWithoutCreatingMultipleObjects {
	
	
	public MethodChainingWithoutCreatingMultipleObjects MethodA() {
		System.out.println("Printing Method A");
		return this;
	}
	
	public MethodChainingWithoutCreatingMultipleObjects MethodB() {
		System.out.println("Printing Method B");
		return this;
	}
	
	public MethodChainingWithoutCreatingMultipleObjects MethodC() {
		System.out.println("Printing Method C");
		return this;
	}

	public static void main(String[] args) {
		
		MethodChainingWithoutCreatingMultipleObjects obj = new MethodChainingWithoutCreatingMultipleObjects();
		obj.MethodA().MethodB().MethodC();
		obj.MethodA().MethodB();
		obj.MethodA();
	}

}
