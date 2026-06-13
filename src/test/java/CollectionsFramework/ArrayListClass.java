package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class ArrayListClass {

	public static void main(String[] args) {
	
		ArrayList <String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Selenium");
		courses.add("abcde");
		courses.add(0, "PHP");
		
		
		//Inserting more string data in one go while using Arrays.asList() method.
		String CourseTest[] = {"Rahul", "Kumar"};
		courses.addAll(Arrays.asList(CourseTest));
		System.out.println(courses);
		System.out.println(courses.get(0));
		

		String a[] = {"rahul", "kumar", "Sah" };
		System.out.println(a[0]);
		
		String[] b = new String[3];
		b[0]="Hello";
		b[1]="Hey";
		b[2]="Hi";
		
		System.out.println(b[2]);
		System.out.println(b[1]);
	}

}
