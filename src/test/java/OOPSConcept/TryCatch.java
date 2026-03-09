package OOPSConcept;

public class TryCatch {

	public static void main(String[] args) {
		int a = 10;
		
		try {
			int res = a/0;
			System.out.println("Result is: " + res);
		}
		catch (Exception e) {
			System.out.println("Divide by zero error");
			System.out.println(e);
//			e.printStackTrace();
		}									

	}

}
