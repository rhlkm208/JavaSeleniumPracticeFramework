package OOPSConcept;

public class ChildClass extends ParentClass {
	
	int timeout = 60;
	public void pay() {
		System.out.println("Pay");
//		timeout = 30;

	}

	public void swap() {
		System.out.println("swap");
		int a = 30;
		int b =20;
		System.out.println(a + b);

	}

	public static void main(String[] args) {

		PaymentInterface.test();
		System.out.println(PaymentInterface.a);
		PaymentInterfaceChild paych = new PaymentInterfaceChild();
		paych.pay();
		paych.swap();

	}
}
