package CollectionsFramework;

import java.util.LinkedList;

public class LinkedListClass {
	
	// LinkedList uses a doubly linked list and is faster for insertion and deletion.


	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		names.add("Rahul");
		names.add("Amit");
		names.add("Neha");
		names.add(0, "Ajay");
		
		System.out.println(names.get(2));
		names.remove(0);
		System.out.println(names);
	}

}
