import java.util.*;

public class Baekjoon_2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 공백부터 생각해야 되는 문제!
		// 위쪽 
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
		// 아래
		
		 for (int i = n - 2; i >= 0; i--) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < 2 * (n - i) - 1; k++) {
	                System.out.print("*");
	            }
            System.out.println();
        }
		
		sc.close();
	}

}
