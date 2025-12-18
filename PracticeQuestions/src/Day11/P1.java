package Day11;
//..Using Inbuilt Method Of String../
// charAt()          // intern()
// conact()          // split()
// contains()        // trim()
// endsWith()        // equalsignoreCase()
// startsWith()      // replace()
// indexOf()         // replaceAll()
// valueOf()         
public class P1 {
	public static void main(String[] args) {
		//..Use of charAt()..//
		String str = "Hitesh";
		System.out.println(str.charAt(5));
		
		//..Use of concat()..//
		System.out.println(str.concat("Malviya"));
		
		//..use of contains()..//
		System.out.println(str.contains("Hi"));
		
		//..use of endsWith()..//
		System.out.println(str.endsWith("h"));
		
		//..Use of StartsWith()..//
		System.out.println(str.startsWith("H"));
		
		//..Use of IndexOf()..//
		System.out.println(str.indexOf("t"));
		
		//..Use of ValueOf()..//
		String str1 = "20";
		String str2 = "40";
		Integer i1 = Integer.valueOf(str1);
		Integer i2 = Integer.valueOf(str2);
		
		System.out.println(i1 + i2);
		
		int i = 12;
		int j = 17;
		
		String s1 = String.valueOf(i);
		String s2 = String.valueOf(j);
		
		System.out.println(s1 + s2);
		
		//..Use of trim()..//
		String st = "    hitesh  malviya   ";
		System.out.println(st.trim());
		
		//..Use EqualsIgnoreCase()..//
		String h1 = "HITESH";
		String h2 = "hitesh";
	    System.out.println(h1.equalsIgnoreCase(h2));
	    
	    //..Use of Replace() & ReplaceAll()..//
	    System.out.println(st.replace(" ",""));
	    System.out.println(st.replaceAll("\\s",""));
	    
	    //..Use of split()..//
	    String st1 = "Prasoon Bidu Java";
	    // Split Particular String on Space 3 time
	    String[] sa1 = st1.split(" ",3);
	    for(String val:sa1) {
	    	System.out.println(val); }
	    
	    //..Use of intern()..//
	    String a1 = new String("Java").intern();
	    String a2 = "Java";
	    
	    System.out.println(a1 == a2);
		
	}

}
