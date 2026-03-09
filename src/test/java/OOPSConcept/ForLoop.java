package OOPSConcept;

public class ForLoop {
	
	public void Series() {
		int i;
		for(i=1; i<10; i++) {
			System.out.println(i);
		}
		}
		
	public void TableCount() {
		int j;
		for(j=5; j<=50;j=j+5) {
			System.out.println(j);
		}
	}
	public static void main(String[] args) {
		ForLoop obj = new ForLoop();
		System.out.println("Printing Series:");
		obj.Series();
		System.out.println("Printing Table of 5:");
		obj.TableCount();
		
	}
}

