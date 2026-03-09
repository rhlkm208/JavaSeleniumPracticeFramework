package OOPSConcept;

public class PaymentInterfaceChild implements PaymentInterface {

	@Override
	public void pay() {
		System.out.println("Pay");

	}

	public void swap() {
		System.out.println("swap");
		int a = 30;
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
