import java.util.*;
import java.io.*;

public class Baekjoon_10986_bf {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long S = 0;
        long D[] = new long[M];
        long result = 0;
        
        st = new StringTokenizer(bf.readLine());
        for(int i = 1; i <= N; i++) {
        	S += Integer.parseInt(st.nextToken());
        	S %= M;
        	D[(int)S]++;
        }
        result += D[0];
        for(int i = 0; i < M; i++) {
        	result += (D[i] * (D[i] - 1) / 2);
        }
        System.out.println(result);
    }
}
