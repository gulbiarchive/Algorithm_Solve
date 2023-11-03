import java.util.*;
public class Baekjoon_2447 {

	/* private : 접근 제어자 중 하나 
	해당 클래스 내부에서만 사용 가능하고 외부에서 직접 접근할 수 없다. 
	클래스의 내부 구현을 보호하고 오류를 줄이는 데 도움이 된다.
	즉, 현재 class 내부에서만 사용할 수 있다. */
	private static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N : 패턴의 크기 
		int N = sc.nextInt();
		
		// 2차원 배열 선언 
		arr = new char[N][N];
        
		 /* star 함수 호출하여 별모양 패턴 생성하고 
		 arr 배열에 저장 
		 (0, 0) -> 시작 위치
		 N : 현재 패턴의 크기, 처음에는 전체 패턴의 크리고 시작 
		 false : 현재 패턴이 공백이 아님을 나타냄 
		 처음에는 전체 패턴이 별(*)로 채워져야 하므로 false로 시작 */
		star(0, 0, N, false);
 
		// StringBuilder : 문자열을 빠르게 조작하기 위한 클래스 
		StringBuilder sb = new StringBuilder();
		// 중첩 루프를 통해서 행(row, 세로) 
		// 열(column, 가로) 순회 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// 현재 위치에 있는 문자를 sb에 추가 
				sb.append(arr[i][j]);
			}
			// 각 행이 끝날 때마다 줄 바꿈 문자 추가하여 각 행 구분 
			sb.append('\n');
		}
		System.out.print(sb);
		sc.close();
	}
	
 
	// star 함수 
	// x, y 현재 패턴을 생성할 시작 위치 
	// N : 현재 패턴의 크기 
	// blank : 현재 패턴이 공백인지 여부 나타냄 
	static void star(int x, int y, int N, boolean blank) {
 
		/* blank가 true인 경우 -> 공백
		 * blank가 false인 경우 -> 별
		 * if 뒤 true 값 오면 그 안 구문 실행 
		 */
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		// 패턴의 크기가 1일 경우, 별(*) 채움 
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
 
		/*
		   N=27 일 경우 한 블록의 사이즈는 9이고, 
		   N=9 일 경우 한 블록의 사이즈는 3이듯
		   해당 블록의 한 칸을 담을 변수를 의미 size
           
		   count는 별 출력 누적을 의미
		 */
 
		// 패턴 작게 쪼개기 
		int size = N / 3;
		int count = 0;
		// i, j 업데이트 하면서 count 누적 
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				// count가 5인 경우 
				if (count == 5) { // 공백 칸일 경우
					// ture로 전달하여 blank 변수 true로 설정
					// 해당 구간 공백 처리 
					star(i, j, size, true);
				}
				// 그게 아니라면 false 전달하여 blank 변수 false로 설정
				// 해당 패턴 별 패턴으로 처리 
				else {
					star(i, j, size, false);
				}
			}
		}
		
		
	}

}
