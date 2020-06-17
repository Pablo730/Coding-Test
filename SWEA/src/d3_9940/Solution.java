package d3_9940; //����1
//�����ľ�: length N�� N���� ���ڰ� �־��� ��, �ش� ���ڵ��� 1~N������ ���ڷ� �̷�����ִ� �������� Ȯ���ϴ� ����
//�������� - 1.�־����� ������ ���Ҵ� 1�̻� N�����̹Ƿ� 1���� ������ N���� ū�� üũ�� �ʿ䰡 ����
//�������� - 2.��, �� �ѹ��̶� �ߺ� �� ���ڰ� ������ No, �ߺ��� ������ Yes
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