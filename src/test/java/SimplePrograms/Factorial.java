package SimplePrograms;

public class Factorial {
	
	
	
	public int fact(int n) {
		int res;
	if (n==0 || n==1) 
	return 1;
	else
	res = fact(n-1)*n;
	return res;
	
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		int fact = f.fact(5);
		System.out.println("Factorial is: " + fact);

	}

}
