package ConceptualTrickyPrograms;

public class ThreadClass {
	
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
	//	th.start();
		th.run();
		System.out.println(th);
		System.out.println(th.getPriority());	
		
	}
}
