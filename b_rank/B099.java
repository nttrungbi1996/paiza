package b_rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B099 {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		Scanner sc = new Scanner(System.in);

		int N = 3;
		int M = 200;
		int[][] B = new int[][] { { 100, 200, 20 },
				{ 100, 20, 20 },
				{ 500, 20, 20 } };

		List<Integer> result = new ArrayList<>();
		sc.close();

		for (int i = 0; i < N; i++) {
			int j = 0;
			while (j < N) {
				if (B[j][i] >= M)
					break;
				j++;
			}
			if (j == N)
				result.add(i + 1);
		}
		if (result.size() > 0 && !result.isEmpty()) {
			// 半角スペース区切りで全ての要素を出力（最後の要素はスペースなし）
			for (int i = 0; i < result.size() - 1; i++) {
				System.out.print(result.get(i) + " ");
			}

			// 最後の要素を出力（スペースなし）
			System.out.print(result.get(result.size() - 1));
		} else {
			System.out.println("wait");
		}
	}
}
