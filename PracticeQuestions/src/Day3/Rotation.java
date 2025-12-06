package Day3;
//............2D Array Rotation(90 degree).............//
public class Rotation {
        public static void main(String[] args) {
			int arr[][] = {
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			// Change Row to Column //
			for(int i = 0; i < arr.length; i++) {
				for(int j = i; j < arr.length; j++) {
					int temp = arr[i][j];
					arr[i][j]= arr[j][i];
					arr[j][i]=temp;
				}
			}
			// Swapping Array Elements
			int n = arr.length-1;
			for(int i = 0; i < arr.length&&i<n; i++) { 
				for(int j = 0; j < arr.length; j++) {
				int t = arr[j][i];
				arr[j][i] = arr[j][n];
				arr[j][n] = t;
				}
				n--;
			}
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}
}