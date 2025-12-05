package Day2;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };

		System.out.println("Printing Array: -");
		for (int ele : arr) {
			System.out.println(ele);
		}

		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int t = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = t;

		}
		System.out.println("Printing Reverse Array: -");
		for (int ele : arr) {
			System.out.println(ele);
		}
	}
}
