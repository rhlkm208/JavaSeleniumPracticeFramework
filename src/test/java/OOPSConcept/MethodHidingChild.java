package OOPSConcept;

class MethodHidingChild extends MethodHiding {
	static void show() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
//		MethodHiding mh = new MethodHiding();
//		mh.show();
		MethodHiding.show();
		MethodHidingChild.show();

	}

}
