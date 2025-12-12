package Day7;
//......Used of String......//
public class Str {
      public static void main(String[] args) {
   //....Create String Literal....//
    	  String s1 = "Java"; //[Store in SCP(String Constant Pool)]//
          String j1 = "Java";
    	  System.out.println(s1);
   //....Create string Using New Keyword....//
    	  String s2 = new String("Java Program");//..[Store in Heap Memory Area]..//
    	  String s3 = new String("Java Program");
    	  String s4 = new String("Java Program");
    	  String s5 = new String("Java Program");
    	  String s6 = new String("Java Program");
    	  
    	  System.out.println(s2);
    	  //...Comparison..//
    	  //..Check Content..//
    	  System.out.println(s2.equals(s4));
    	  //..Check Reference..//
    	  System.out.println(s2 == s4);
    	  
	}
}
   
