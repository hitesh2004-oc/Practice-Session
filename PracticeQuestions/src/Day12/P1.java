package Day12;
//.....Use .equal Method of Object Class.....//
public class P1 {
	public static void main(String[] args) {
		// .equals Method Basically use for compare Reference of object//
		String s1 = "Java"; 
		String s2 = "Java";
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Java");
		
		//..In String .equals check/Compare the Content..//
		// Because String Override the Equals Method //
		
		System.out.println(s1.equals(s2));
		
		//..In StringBuffer .equals Method Check/Compare Reference..//
		// Not Override the .equals Method //
		System.out.println(sb1.equals(sb2));
		
		String s = "Java";
		s = s + "Programming"; // 2 object Create in SCP
		System.out.println(s);
		
		String s3 = "Java" + "Programming"; // 3 object Create in SCP
		System.out.println(s3);
	}
}
