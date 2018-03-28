package Bpgms_patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringArraytoArrayList {

	public static void main(String[] args) {
		
		String[] a = {"cat","bat","mat"};
		ArrayList al = new ArrayList<>();
		Collections.addAll(al,a);
		List<String> b = Arrays.asList(a);
		for(String bb:b){
			System.out.println(bb);
		}
		Iterator<String> i = al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		}

	}


