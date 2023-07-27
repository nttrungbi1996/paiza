package b_rank;

import java.util.Scanner;

public class B108 {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int[] A_ = new int[A];
		int[] B_ = new int[B];
		int[] C_ = new int[A];

		for (int i = 0; i < A; i++) {
			A_[i] = sc.nextInt();
		}

		for (int i = 0; i < B; i++) {
			B_[i] = sc.nextInt();
		}
		int j = 0;
		int i = 0;
		while (j < B) {
			if (B_[j] > A_[i]) {
				C_[i] += A_[i];
				B_[j] = B_[j] - A_[i];
			} else if (B_[j] <= A_[i]) {
				C_[i] += B_[j];
				B_[j] = 0;
			}
			i++;
			if (B_[j] == 0) {
				j++;
			}
			if (i == A) {
				i = 0;
			}
		}

		for (int C : C_) {
			System.out.println(C);
		}
		
		sc.close();
	}
}