package github.collections;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map = new HashMap<>();
		
		for(int i=0; i<100;i++) {
			
			map.put(i, "AAAA"+i);
			
		}
		
//		System.out.println(map);
		
		
		String data = map.get(5);
		
		System.out.println(map);
		System.out.println(data);
		
		
		Integer i1= new Integer(123);
		Integer i2= new Integer(123);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
	}

}
