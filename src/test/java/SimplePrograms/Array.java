package SimplePrograms;

public class Array {
	
	

	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0] = 5;
		a[3]=20;
//		a[5] = 15;
		int c[] = {5, 10, 15, 20};
		int b[] = {1, 2, 3, 4, 5, 6};
		System.out.println(c[2]);
//		System.out.println(a[5]);
		//
		int[] sum = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			sum[i] = c[i] + b[i];
			System.out.println("sum[" + i + "] = " + sum[i]);
		}
		

	}

}
