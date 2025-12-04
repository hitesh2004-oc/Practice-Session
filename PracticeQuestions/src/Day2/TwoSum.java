package Day2;

import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target Value: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  
                if (arr[i] + arr[j] == target) {
                    System.out.println("["+i+", "+j+"]");
                    count++;
                }
            }
        }  
        if (count == 0) {
            System.out.println("No Pair Found");
        }
    }
}
