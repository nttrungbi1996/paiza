package b_rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B091 {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] H = new int[N][N];
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				H[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (isTop(i, j, N, H)) {
					result.add(H[i][j]);
				}
			}
		}
		
		// 高い順にソート
        Collections.sort(result, Collections.reverseOrder());

        // 結果を出力
        for (Integer num : result) {
            System.out.println(num);
        }
        
		sc.close();
	}

	public static boolean isTop(int i, int j, int N, int[][] H) {
		
		int left = 0;
		int right = 0;
		int top = 0;
		int bottom = 0;
		
		if(i-1>=0) {
			left = H[i-1][j];
		}
		if(i+1<N) {
			right = H[i+1][j];
		}
		if(j-1>=0) {
			top = H[i][j-1];
		}
		if(j+1<N) {
			bottom = H[i][j+1];
		}
		

		if (H[i][j] <= left)
			return false;
		if (H[i][j] <= right)
			return false;
		if (H[i][j] <= top)
			return false;
		if (H[i][j] <= bottom)
			return false;

		return true;
	}

}
