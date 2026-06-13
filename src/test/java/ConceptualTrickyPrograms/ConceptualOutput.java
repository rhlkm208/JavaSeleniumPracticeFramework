package ConceptualTrickyPrograms;

public class ConceptualOutput {
	
		
	
	public static void main(String[] args) {
		
		System.out.println(10 + 20 + "Hello"); // "30Hello" — left to right: 10+20=30, then
		System.out.println("Hello" + 10 + 20); // "Hello1020" — all string concat after fir

		byte b = 10;
//		b = b + 1; // ❌ Compile error: b+1 promotes to int
		b += 1; // ✅ Compiles: += has implicit cast (byte)(b+1)
		System.out.println(b);
		
		char c = 'A';
		System.out.println(c + 1); // 66 — char promoted to int
		System.out.println((char)(c+1)); // B — cast back to char
		System.out.println("" + c + 1); // A1 — string concat
		
		
	}

}
