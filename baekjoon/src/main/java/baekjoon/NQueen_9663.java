package baekjoon;

public class NQueen_9663 {
	static int count = 0;
	static int n;
	static int chk = 0;
	static int k;

	public static void main(String[] args) {
		n = 4;
		k = 2;
		
		for (int i = 1; i <= n; i++) {
			int[] col = new int[n + 1];
			col[1] = i;
			dfs(col, 1);
			chk = 0;
		}
		System.out.println(count);
	}
	
	public static void dfs(int[] col, int row) {
		if (row <= n && chk == k) {
			nprint(col);
			count++;
		} else {
			for (int i = 1; i <= n; i++) {
				col[row + 1] = i;
				if (isPossible(col, row + 1)) {
					dfs(col, row + 1);
					chk++;
				}
			}
		}
	}
	
	public static boolean isPossible(int[] col, int row) {
		for (int i = 1; i < row; i++) {
			if (col[i] == col[row]) {
				return false;
			}
			if (Math.abs(i - row) == Math.abs(col[i] - col[row])) {
				return false;
			}
		}
		return true;
	}
	
	public static void nprint(int[] col) {
		for (int i = 1; i < col.length; i++) {
			System.out.print(col[i] + " ");
		}
		System.out.println();
	}

}
