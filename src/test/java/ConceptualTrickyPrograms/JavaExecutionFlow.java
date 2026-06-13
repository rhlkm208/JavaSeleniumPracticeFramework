package ConceptualTrickyPrograms;

public class JavaExecutionFlow {

	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}

	JavaExecutionFlow() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		new JavaExecutionFlow();
	}
}
