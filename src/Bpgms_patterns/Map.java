package Bpgms_patterns;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) { 
		String s="success";
		char[] c=s.toCharArray();
		HashMap<Character, Integer> h=new HashMap<>();
		for(char b:c){
			if(!h.containsKey(b))
			h.put(b, 1);
			else
				h.put(b, h.get(b)+1);
		}
		
		for(Entry<Character,Integer> entry:h.entrySet()){
			
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}

}
