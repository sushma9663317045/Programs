import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		HashMap<String,String> cc=new HashMap<>();
		cc.put("India", "91");
		cc.put("usa", "13");
		cc.put("uk", "51");
		
		Iterator i = cc.keySet().iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		Iterator i1=cc.values().iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
		
		Iterator i2=cc.entrySet().iterator();
		while(i2.hasNext()){
			System.out.println(i2.next());
		}
		
		Set<String> b=cc.keySet();
		for(String bb:b){
			System.out.println(bb);
		}
		
		Collection<String>  b1=cc.values();
		for(String bc:b1){
			System.out.println(bc);
		}
		
		Set<Entry<String,String>> entry =cc.entrySet();
		for(Entry<String,String> entries:entry){
			System.out.println(entries.getKey()+" the calling code is--->"+entries.getValue());
		}
	}

}
