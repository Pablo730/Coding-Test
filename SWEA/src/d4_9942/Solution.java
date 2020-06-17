package d4_9942;//순열2 - 길이 N의 순열이란, 1부터 N까지의 자연수를 적당한 순서로 섞어서 만든 수열을 의미
//문제파악: 길이 N의 두 수열 (A1, A2, ⋯, AN)과 (B1, B2, ⋯, BN)이 있을 때 수열의 점수 s(A,B) 를 각 인덱스의 두 수의 최댓값의 합으로 정의
// - 즉  s(A,B) = max(A1, B1) + max(A2, B2) + ⋯ + max(AN, BN)
// - 가능한 모든 길이 N인 순열의 순서쌍 (N!)제곱 가지에 대해서, 우리는 수열의 점수가 K이상인 순서쌍의 개수를 찾고 싶다
//생각정리 - 1.어떻게 N!제곱가지의 순서쌍이 나오는지 부터 파악 : 1~N까지 순열 가지수가 N!이고 순열이 두개이기 때문에 N!*N!이 됨 
//생각정리 - 2.테스트 케이스 N=2 K=1 -> 4개, N=3 K=8 -> 18이 주어졌을 때 손으로 해당 테스트 케이스를 풀어 봄
//생각정리 - 3.첫번째 시도 - N!제곱의 가지수를 모두 탐색하는 완전탐색의 방향으로 구현

import java.util.Scanner;

class Solution{ 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
		
		}
		sc.close();
	}
}