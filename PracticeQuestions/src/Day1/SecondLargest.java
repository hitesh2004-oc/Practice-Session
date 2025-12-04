package Day1;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter Array Size: ");
	      int n = sc.nextInt();
	      
	      int arr[] = new int[n];
	      System.out.println("Enter Elements");
	      for(int i =0 ; i<n; i++) {
	    	  arr[i] = sc.nextInt();
	      }
	      int largest=Integer.MIN_VALUE;
	      int second=Integer.MIN_VALUE;
	      // Second Largest Elements Find Approach //
	      for (int i=0;i<n;i++) {
	            if (arr[i] > largest) {
	                second = largest;
	                largest = arr[i];
	            } else if (arr[i] < largest && arr[i] > second) {
	            	 second = arr[i];
	            }
	        }
	     System.out.println("Second Largest: "+second);	 
	}
}
