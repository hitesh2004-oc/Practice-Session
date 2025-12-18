package Day11;

public class RemoveSpaces {
	public static void main(String[] args) {
		//Without Using Inbuilt Method
		String str1 = "Prasoon Bidua Java";
		
		String emptystr = "";
		//.....Main Approach.....//
		for(int i = 0;i<str1.length();i++) {
		 
		if( str1.charAt(i) != ' ') {
			emptystr = emptystr +  str1.charAt(i);
		    }
		  }
		System.out.println(emptystr);
	}
}
