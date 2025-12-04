package Day1;
import java.util.Scanner;
//Print Marks Less Than 35//
public class PrintMarks {
	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter size of array : ");
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      System.out.println("Enter Mark:-");
	      for(int i=0; i<n;i++) {
	    	  arr[i] = sc.nextInt();
	      }
	      
	      for(int i=0; i<n;i++) {
	    	  //Main Logic(Approach)//
	    	  if(arr[i]<35) {
	    	  System.out.println(i+": "+arr[i]);
	    	  }
	      }
	    
	}
}
