package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair4 {
	int x;
	int y;
	
	Pair4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Tomato_7576 {
	static final int[] dx = {1, -1, 0, 0};
	static final int[] dy = {0, 0, 1, -1};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] farm = new int[n][m];
		Queue<Pair4> queue = new LinkedList<Pair4>();
		boolean[][] chk = new boolean[n][m];
		int day = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				farm[i][j] = scanner.nextInt();				
				if (farm[i][j] == 1) {
					queue.add(new Pair4(i, j));
					chk[i][j] = true;
				}				
			}
		}	
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Pair4 point = queue.remove();
				int x = point.x;
				int y = point.y;
				int nx = 0;
				int ny = 0;
				
				for (int k = 0; k < 4; k++) {
					nx = x + dx[k];
					ny = y + dy[k];
					if (0 <= nx && nx < n && 0 <= ny && ny < m) {
						if (farm[nx][ny] == 0 && chk[nx][ny] == false) {
							queue.add(new Pair4(nx, ny));
							farm[nx][ny] = 1;
							chk[nx][ny] = true;
						}
					}
					
				}
				
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(farm[i][j]);
				}
				System.out.println();
			}
			
			day++;
		}		
		
		if (day == 1) {
			System.out.println(0);
		}
		else if (day == 0){
			System.out.println(-1);
		}
		else {
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if(farm[i][j] == 0) {
						cnt++;
					}
				}
			}
			if (cnt == 0) {
				System.out.println(day-1);
			}
			else {
				System.out.println(-1);
			}
		}
		
	}

}
