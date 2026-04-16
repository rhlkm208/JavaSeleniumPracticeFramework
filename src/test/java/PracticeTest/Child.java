package PracticeTest;

public class Child extends Parent {

    Child(int x) {
        super(x, "rahul"); // ✅ Calls Parent(int, String)
    }

    @Override
	protected void methodA() {
        System.out.println("Child - methodA"); // ✅ Fixed misleading print
    }

    public static void main(String[] args) {
        Parent p = new Parent(10, "hello"); // ✅ Uses valid constructor
        p.methodA(); // → Parent - methodA

        Parent q = new Child(0);  // ✅ Upcasting — allowed
        q.methodA();              // → Child - methodA (runtime polymorphism)

        Child r = new Child(0);
        r.methodA();              // → Child - methodA

        // Child s = new Parent(10, "x"); // ❌ Downcasting without cast — not allowed
    }
}
 