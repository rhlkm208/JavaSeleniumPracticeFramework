package List;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		int age[] = {18, 20, 25, 16, 18, 34, 20};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int a : age)
		{
			set.add(a);
		}
		
		System.out.println(set);
		
		HashSet<Integer> hm = new HashSet<>();
		hm.add(1);
		hm.add(2);
		hm.add(3);
		
		System.out.println(hm);
		
		System.out.println(hm.size());
	
	}

}
