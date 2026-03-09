package OOPSConcept;

public class TestConstructor {
	double a;
	double b;
	double c;
	
	public TestConstructor() {
		
		a=10;
		b=20;
		c=30;
		System.out.println("This is a constructor 1");
	}

	public TestConstructor(double w, double x, double y) {
		a=w;
		b=x;
		c=y;
		System.out.println("This is a constructor 2");
		
	}
	
	public TestConstructor(double w) {
		a=b=c=w;
		System.out.println("This is a constructor 3");
	}
	
	public double area() {
		double area = a*b*c;
		return area;
	}
	
	public double areanew() {
		double area = a*b;
		return area;
	}
	public static void main(String[] args) {
		
		TestConstructor obj1 = new TestConstructor();
		TestConstructor obj2 = new TestConstructor(5,10,15);
		TestConstructor obj3 = new TestConstructor(7);
		
		System.out.println("Area 1: " + obj1.area());
		System.out.println("Area 2: " + obj2.area());
		System.out.println("Area 3: " + obj3.areanew());

	}

}
