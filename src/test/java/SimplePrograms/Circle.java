package SimplePrograms;

public class Circle {
	
	public void area() {
		double pi = 3.14;
		int r=5;
		double res = pi*r*r;
		System.out.println(res);
	}
	

	public static void main(String args[]) {
	Circle obj = new Circle();
	obj.area();
	}
}
