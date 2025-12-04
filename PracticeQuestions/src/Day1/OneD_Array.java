package Day1;
import java.util.Scanner;

public class OneD_Array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Array Size: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	// One Dimensional Array Print Approach //
	System.out.println("Enter Array Elements: -");
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	for (int i = 0; i < n; i++) {
		System.out.print(arr[i]+" ");
	}
	
}

}
