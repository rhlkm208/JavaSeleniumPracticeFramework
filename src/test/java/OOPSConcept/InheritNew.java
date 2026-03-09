package OOPSConcept;

public class InheritNew extends Inherit {
	
	public void multy() {
		int m = 5;
		int n = 2;
		int o = m*n;
		System.out.println(o);
	}

	public static void main(String args[]) {
		
		InheritNew obj = new InheritNew();
		obj.add();
		int res = obj.subs(20, 10);
		obj.multy();
		System.out.println(res);
	}
}
