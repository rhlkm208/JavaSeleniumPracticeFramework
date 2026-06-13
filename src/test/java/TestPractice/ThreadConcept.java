package TestPractice;

public class ThreadConcept {

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
//		t1.start();
//		t1.run();
		t1.getId();
		
		Thread t2 = new Thread();
		t2.getId();
		
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getThreadGroup());
		
		System.out.println(Thread.currentThread().getClass());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getContextClassLoader());
		
	}
}
