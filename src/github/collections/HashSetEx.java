package github.collections;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("D");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("E");
		
		
		set.add(new String("A"));
		
		System.out.println(set);
	
		
	}
	
	
}
