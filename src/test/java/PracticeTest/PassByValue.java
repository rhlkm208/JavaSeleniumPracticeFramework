package PracticeTest;

public class PassByValue {
	
	void modify(StringBuilder sb) {
		sb.append(" World"); // ✅ modifies original object
		sb = new StringBuilder("New"); // ❌ only reassigns local copy
		}
	

	public static void main(String[] args) {
		PassByValue pb = new PassByValue();
		StringBuilder s = new StringBuilder("Hello");
		pb.modify(s);
		System.out.println(s); // "Hello World"
	}

}
