package Day24;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*Convert Array to Collection Using
  -- Arrays.asList() Method -- */

/*Convert Collection to Array Using
  -- .toArray() Method -- */

public class P3 {
	public static void main(String[] args) {
		String arr[] = {"Java", "Python", "JavaScript"};
		
		//..Array to Collection Conversion..//
		// Using Arrays.asList()
		List<String> l1 = Arrays.asList(arr);
		System.out.println("List : "+l1);
		//l1.add("hitesh"); // UnsupportedOperationException
  /* The Array is Convert into Collection but There is on
     Exception you cannot add or remove elements form
     the List. */

  //-- For This Problem We Use ArrayList --//
	List<String> l2 = new ArrayList<>(Arrays.asList(arr));
	    l2.add("hitesh");
	    l2.remove(0);
	    System.out.println("List2 : "+l2);
	    
	    //..Collection to Array Conversion..//
	    // Using .toArray()
	    String[] arr1 = l2.toArray(new String[0]);
	    for(String s : arr1) {
	    	System.out.println(s);
	    }
	    
	    //..Hash Map to Array Conversion..//
	    HashSet<String> hs = new HashSet<>();
	    hs.add("Java");
	    hs.add("SprintBoot");
	    hs.add("C++");
	    System.out.println(hs);
	    
	    String arr3[] = hs.toArray(new String[0]);
	    for(String s1 : hs) {
	    	System.out.println(s1);
	    }
	}

}
