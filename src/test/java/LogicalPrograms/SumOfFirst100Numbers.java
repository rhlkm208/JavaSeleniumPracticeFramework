package LogicalPrograms;

public class SumOfFirst100Numbers {

	public static void main(String[] args) {
		int res=0;
		
		for(int i=1; i<=100; i++) {
			res = res+i;
		}

		System.out.println("Sum of first 100 number is equal to = "+ res);
	}

}
