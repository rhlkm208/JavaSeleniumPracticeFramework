package TestPractice;

import PracticeTest.Parent;

public class Childa extends Parent {

	Childa() {
		super(10, "Rahul");

	}

	protected void methodA() {

		System.out.println("Parent - methodA");
	}
}
