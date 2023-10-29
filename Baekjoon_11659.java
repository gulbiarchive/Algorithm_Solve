import java.io.*;
import java.util.*;

public class Baekjoon_11659 {

	public static void main(String[] args) throws IOException {
		// Scanner 사용 시 시간 초과
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		// 입력 첫째줄의 N, M 입력 
		// N : 수의 개수, M : 합을 구해야 하는 횟수 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		// S : 누적 합을 저장할 배열 
		// N + 1 -> 0 ~ N까지의 누적 합을 저장하기 위해 
		int[] S = new int[N + 1];
		
		// 문자열을 분해하여 개별 토큰으로 얻기 
		// 1) bf.readLin()을 사용하여 입력 읽어오기 -> 한 줄 읽어오는 함수 
		// 2) StringTokenizer 사용하여 읽어온 한 줄의 문자열을 공백을 기준으로 나누기 
		// -> 입력 줄을 공백으로 분할하여 개별 토큰으로 만든다. 
		// 3) for 루프를 사용하여 각 토큰을 정수로 변환하고 배열 S에 저장
		// 예)"1 2 3 1 2 " -> "1", "2", "3", "1", "2" -> 정수 변환하여 배열 저장 
		st = new StringTokenizer(bf.readLine());
		
		for(int i = 1; i <= N; i++) {
			//누적 합 저장
			S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		
		for(int q = 0; q < M; q++) {
			// 한 줄 읽어옴 예) "1 3" -> 1부터 3까지의 구간 의미
			// 문자열을 토큰으로 나누고 공백을 기준으로 분할한 뒤 st에 저장 
			st = new StringTokenizer(bf.readLine());
			// st.nextToken()을 사용하여 토큰 읽어온 후 i, j에 각각 대입 
			// i : 구간 시작 위치, j : 구간 끝 위치 
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			// 인덱스 0이 아닌 1부터 시작하는 이유 
			// 문제에서 N개의 범위 1부터 시작 
			// S[j] = A[1] + ... A[j]
			// S[j-1] = A[1] + ... + A[i-1]
			System.out.println(S[j] - S[i-1]);
		}

	}

}
