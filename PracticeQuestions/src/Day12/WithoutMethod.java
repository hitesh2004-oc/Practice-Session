package Day12;

import java.util.Arrays;
 //....Check Anagram or Not Without Using Inbuilt Method....//
public class WithoutMethod {
	public static void main(String[] args) {
		
		String str1 = "School Master";
		String str2 = "The Classroom";
		
		// Step 1:- Remove Spaces in String
		String emp1="";
		for(int i = 0;i<str1.length();i++) {
		           if(str1.charAt(i) != ' ') {
		        	   emp1 = emp1 + str1.charAt(i);
		           }
		        }
		String emp2= "";
		for(int i = 0;i<str2.length();i++) {
	           if(str2.charAt(i) != ' ') {
	        	   emp2 = emp2 + str2.charAt(i);
	           }
           	}
		//Check Removing Spacing 
		System.out.println(emp1);
		System.out.println(emp2);
		
		// Step 2:- Convert all Character to LowerCase
		String s1 = "";
		for(int i = 0;i<emp1.length();i++) {
			char ch = emp1.charAt(i);
			 int a = ch;
		        if(a>=65 && a<=96) {
		        	 a = ch + 32;
		        	 ch = (char) a;
				       s1 = s1+ch;
		        }else   s1 = s1+ch;
		      }
		String s2 = "";
		for(int i = 0;i<emp2.length();i++) {
			char ch = emp2.charAt(i);
			 int a = ch;
		        if(a>=65 && a<=96) {
		        	 a = ch + 32;
		        	 ch = (char) a;
				       s2 = s2+ch;
		        }else   s2 = s2+ch;
		     }
		//..Check Convertion..//
		System.out.println(s1);
		System.out.println(s2);
		
		// Step 3:- Store String Character into Arrays
		int a1 = s1.length();
		int a2 = s2.length();
		char arr1[] = new char[a1];
		char arr2[] = new char[a2];
		for(int i = 0;i<arr1.length;i++) {
		      arr1[i] = s1.charAt(i);
		}
		
		for(int i = 0;i<arr2.length;i++) {
		      arr2[i] = s2.charAt(i);
		}
	
		// Step 4:- Sorting the Arrays  
	    for(int i = 0;i<arr1.length;i++) {
	       for(int j = i+1;j<arr1.length;j++) {
	    	   int a = arr1[i];
	    	   int b = arr1[j];
	    	   if(a>b) {
	    		   char temp = arr1[i];
	    		   arr1[i] = arr1[j];
	    		   arr1[j] = temp; 
	    	   }
	       }	
	    }
	    for(int i = 0;i<arr2.length;i++) {
		       for(int j = i+1;j<arr2.length;j++) {
		    	   int a = arr2[i];
		    	   int b = arr2[j];
		    	   if(a>b) {
		    		   char temp = arr2[i];
		    		   arr2[i] = arr2[j];
		    		   arr2[j] = temp; 
		    	   }
		       }	
		    }
	    
	    // Step 5:- Check String is Anagram or Not 
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}else System.out.println("Not Anagram");
		

	}

}
