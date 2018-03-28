package Bpgms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map1 {

	public static void main(String[] args) {
		String str = "success";
		char[] c = str.toCharArray();
		HashMap<Character, Integer> mp = new HashMap<>();
		for (int i = 0; i < c.length; i++) {
			if (!mp.containsKey(c[i]))
				mp.put(c[i], 1);
			else {

				mp.put(c[i], mp.get(c[i]) + 1);
			}

		}
		// System.out.println(mp);

		for (Entry<Character, Integer> entry : mp.entrySet()) {
//			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "----->" + entry.getValue());
//			}
		}

	}
}
