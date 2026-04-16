package PracticeTest;

class B extends A {

	int x = 20;

	void show() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.x); // 10 — variables: compile-time (reference type)
		obj.show(); // B — methods: runtime (object type)
		
		
		
	}
}