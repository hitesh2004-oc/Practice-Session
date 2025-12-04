package Day1;

import java.util.Scanner;

public class FindElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Array Size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Elements: -");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Find Elements:- ");
		int a = sc.nextInt();
		int count = 0;
		int time=0;
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {

				time++;
			} else {
				count++;
			}
		}
		if (arr.length == count) {
			System.out.println("Elements not found");
		}
		if(time >=1) {
			System.out.println("Elements Founded "+time+" Time");
		}
	}
}
