package b_rank;

import java.util.Scanner;

public class B095 {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int Max = 0;

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] B = new int[N][M];

		int[] A = new int[M];

		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			int score = 100;
			for (int j = 0; j < M; j++) {
				int cmd = Math.abs(A[j] - B[i][j]);

				if (cmd > 30) {
					score = score - 5;
				} else if (cmd > 20) {
					score = score - 3;
				} else if (cmd > 10) {
					score = score - 2;
				} else if (cmd > 5) {
					score = score - 1;
				}
			}

			Max = Math.max(Max, score);
		}

		System.out.println(Max);

		sc.close();
	}
}
