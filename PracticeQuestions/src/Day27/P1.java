package Day27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//------ Collection Framework -------//
public class P1 {
	public static void main(String[] args) {
// List Example
		List<String> ls = new ArrayList();
		ls.add("hitesh");
		ls.add("rahul");
		ls.add("vinod");
		System.out.println(ls); // Ordered Order // Added Order //Order Preserved
// Set Example[ Uniques ]
		Set<Integer> unique = new HashSet<>();
		unique.add(10);
		unique.add(20);
		unique.add(30);
		unique.add(10);
		System.out.println(unique); // Unordered order
		
 // Map Example Key Unique value can be Duplicate
		 Map<Integer, String> map = new HashMap<>();
		 map.put(1,"hitesh");
		 map.put(2,"harsh");
		 map.put(3,"vinod");
		 map.put(4,"hitesh");
		 System.out.println(map);
		 
		 // ArrayList
		 List<String> arraylist = new ArrayList();
		 arraylist.add("A");
		 arraylist.add("B");
		 System.out.println(arraylist);
		 
		 // LinkedList
		 List<String> ll = new LinkedList<>();
		 ll.add("A");
		 ll.add("B");
		 System.out.println(ll);
		 
		 // Set 
		 Set<String> hs = new HashSet<>(); // Order not Preserved // Unorder order and uniques value
		 hs.add("hitesh");
		 hs.add("harsh");
		 hs.add("rahul");
		 hs.add("vinod");
		 System.out.println(hs);
		 
		 // LinkdedHashSet
		 Set<String> lhs = new LinkedHashSet<>();// Order Preserved
		 lhs.add("hitesh");
		 lhs.add("harsh");
		 lhs.add("rahul");
		 lhs.add("vinod");
		 System.out.println(lhs);
		 
		 // TreeSet
		 Set<String> ts = new TreeSet<>(); // Alphabetic Order or Ascending Order 
		 ts.add("hitesh");
		 ts.add("harsh");
		 ts.add("rahul");
		 ts.add("vinod");
		 System.out.println(ts);
		 
	}

}
