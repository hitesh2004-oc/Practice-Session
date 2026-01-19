package Day25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//Fail Fast
public class P3 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(101, "One");
		hm.put(102, "Two");
		hm.put(103, "Three");
		
		Set<Entry<Integer, String>> s = hm.entrySet();
		
		Iterator<Entry<Integer, String>>  itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			hm.put(104, "Four");
		}
		System.out.println(hm);
	}

}
