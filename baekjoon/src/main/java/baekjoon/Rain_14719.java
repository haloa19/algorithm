package baekjoon;

import java.util.Scanner;

public class Rain_14719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int[] matrix = new int[w];
		int cnt = 0;
		
		for (int i = 0; i < w; i++) {
			matrix[i] = scanner.nextInt();
		}
		
		for (int i = 1; i < w - 1; i++) {
			cnt += max(matrix, i);
		}
		
		if (cnt < 0) cnt = 0;
		
		System.out.println(cnt);

	}
	
	public static int max(int[] matrix, int idx) {
		int left = matrix[idx];
		int right = matrix[idx + 1];
		
		for (int i = 0; i < idx; i++) {
			if (left < matrix[i]) left = matrix[i];
		}
		
		for (int j = idx + 1; j < matrix.length; j++) {
			if (right < matrix[j]) right = matrix[j];
		}
		
		int max = Math.min(left, right);
		
		return max - matrix[idx];
	}

}
