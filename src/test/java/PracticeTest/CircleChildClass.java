package PracticeTest;

public class CircleChildClass extends ShapeAbstractClass {

	    double radius;

	    CircleChildClass(String color, double radius) {
	        super(color);           // ✅ Must call parent constructor
	        this.radius = radius;
	    }

	    @Override
	    double area() {             // ✅ Must implement abstract method
	        return Math.PI * radius * radius;
	    }
	}
