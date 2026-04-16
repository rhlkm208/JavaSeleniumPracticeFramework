package PracticeTest;

// Abstract class — cannot be instantiated directly
public abstract class ShapeAbstractClass {

    String color;

    // Constructor — abstract classes CAN have constructors
    ShapeAbstractClass(String color) {
        this.color = color;
    }

    // Abstract method — no body, MUST be overridden by subclass
    abstract double area();

    // Concrete method — inherited as-is
    void display() {
        System.out.println("Shape color: " + color);
    }
}