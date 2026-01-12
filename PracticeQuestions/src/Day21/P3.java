package Day21;

public class P3 {
	public static void main(String[] args) {
		int n = 7;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(i == 1 || j == n || j == 1 || i == n) {
					if((i == 1 && j == n) || (i == n && j == n)) {
						System.out.print("  ");
						continue;
					}
					
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
