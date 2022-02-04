package collections;

import java.util.HashMap;

public class HashMapEx2 { 
	
	public static void main(String[] args) {
        
    	String[] participant={"leo", "kiki", "eden"};
    	String[] completion={"eden", "kiki"};
    	
    	
    	String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        
        System.out.println(hm.get("leo"));
        
        
        for (String player : completion) hm.put(player, hm.get(player) - 1);
            
        
        System.out.println(hm.get("leo"));
        System.out.println(hm.get("leo")-1);
        
        
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        
         System.out.println(answer);
//        return answer;
        
    }
}


