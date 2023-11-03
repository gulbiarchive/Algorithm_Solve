import java.util.*;


public class Baekjoon_10986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] S = new long[N];
		long[] D = new long[N];
		long result = 0;
		
		S[0] = sc.nextInt();
		for (int i = 1; i < N; i++) { 
			S[i] = S[i-1] + sc.nextInt();
		}

		for(int i = 0; i < N; i++) {
			int remainder = (int) (S[i] % M);
			if( remainder == 0) 
				result++;
			D[remainder]++;
		}
		for(int i = 0; i < M; i++) {
			if(D[i] > 1) {
				result += (D[i] * (D[i] -1) / 2);
			}
		}
		System.out.println(result);
		
		sc.close();
	}
}
