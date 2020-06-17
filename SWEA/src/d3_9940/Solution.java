package d3_9940; //순열1
//문제파악: length N과 N개의 숫자가 주어질 때, 해당 숫자들이 1~N까지의 숫자로 이루어져있는 수열인지 확인하는 문제
//생각정리 - 1.주어지는 수열의 원소는 1이상 N이하이므로 1보다 작은지 N보다 큰지 체크할 필요가 없음
//생각정리 - 2.즉, 단 한번이라도 중복 된 숫자가 나오면 No, 중복이 없으면 Yes
import java.util.*;

class Solution{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int test_case = 1; test_case <= TC; test_case++){
			int N = sc.nextInt();
			int[] array = new int[N+1];
			boolean check = true;
			for(int i=1; i<=N; i++) {
				int n = sc.nextInt();
				if(array[n]==0) {
					array[n]=n;
				} else {
					check=false;
				}
			}
			if(check) {
				System.out.println("#"+test_case+" Yes");
			}else {
				System.out.println("#"+test_case+" No");
			}
		}
		sc.close();
	}
}