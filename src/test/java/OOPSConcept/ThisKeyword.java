package OOPSConcept;

public class ThisKeyword {
	int a;
	int b;
	int c;
	
	ThisKeyword(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Value of a: " + this.a);
		System.out.println("Value of b: " + this.b);
		System.out.println("Value of c: " + this.c);
	}

	public static void main(String[] args) {
		
		
		ThisKeyword obj = new ThisKeyword(10, 20, 30);
        System.out.println("Value of a from main: " + obj.a);
        System.out.println("Value of b from main: " + obj.b);
        System.out.println("Value of c from main: " + obj.c);
	}


}
