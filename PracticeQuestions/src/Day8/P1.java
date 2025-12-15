package Day8;
//....Uses of String and String Buffer....//
public class P1 {
	public static void main(String[] args) {
		//...Creation of String in Two Way...//
		//(1)...String Literal...//
		String s1 = "hitesh";
		//(2)...Using new Keyword...//
		String s2 = new String("hitesh");
//Only Create New Object(Does not Refer any Ref Variable)//
		s2.concat("malviya");  //[Concat Simply Merge Two String]
//Now s2 Refer to another Object and old Object does not refer by any ref.//		
      	s2 = s2.concat("malviya"); 
      	
      	System.out.println(s2);
		System.out.println(s1.equals(s2));
		
		//....Creation of String Buffer....//
		StringBuffer sb = new StringBuffer("hitesh");
//Using Append to add data to the end of an existing character sequence//
		sb.append("malviya");
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer("hitesh");
    //...Compare Content of sb to sb1...//
        System.out.println(sb.equals(sb1));
	}
}
