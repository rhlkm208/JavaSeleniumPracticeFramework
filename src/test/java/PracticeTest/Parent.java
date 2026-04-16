// Parent.java
package PracticeTest;

public class Parent {
    int a;
    String b;

    // ✅ Add a proper parameterized constructor
   public Parent(int a, String b) {
        this.a = a;
        this.b = b;
    }

    // Copy Constructor
    Parent(Parent p) {
        this.a = p.a;
        this.b = p.b;
    }

    protected void methodA() {
        System.out.println("Parent - methodA");
    }

    final void methodB() {
        System.out.println("Parent - methodB"); // ✅ Fixed typo too
    }
}