import java.util.*;
public class Baekjoon_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1, start = 1, end = 1, sum = 1;
		
		while(end != N) {
			if(sum == N) {
				count++;
				end++;
				sum += end;
			}
			else if(sum > N) {
				sum -= start;
				start++;
			}
			else {
				end++;
				sum += end;
			}
		}
		System.out.println(count);
	}

}
