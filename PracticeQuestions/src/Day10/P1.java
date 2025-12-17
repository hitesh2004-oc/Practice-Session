package Day10;

import java.util.Arrays;
//....Check Strings are Anagram or Not....//
public class P1 {
	public static void main(String[] args) {
		String str1 = "School Master";
		String str2 = "The Classroom";
         
		//Step 1: - Remove Blank Spaces in Strings
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");
		
		//Step 2: - Convert All Character To LowerCase Or UpperCase 
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
        
		//Step 3: - Store/Change String character in Array Form
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		//Step 4: - Sort the Arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
        //Step 5 : - Check Condition Anagram or Not
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else
			System.out.println("Not Anagram");
	}
}
