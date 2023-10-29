import java.util.*;
public class Baekjoon_2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 위쪽(1 ~ 5)
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int k = 1; k <= 2 * (n-i); k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 아래쪽(6 ~ 10)
		for(int i = n-1; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int k = 1; k <= 2 * (n-i); k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
