package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair {
	int x;
	int y;
	
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class BFS_2178 {
	private final static int[] dx = {1, -1, 0, 0};
	private final static int[] dy = {0, 0, 1, -1};	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);	
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int miro[][] = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = scanner.next();
			for (int j = 0; j < m; j++) {
				char[] chr = str.toCharArray();
				miro[i][j] = chr[j] - '0';				
			}
		}
		
		Queue<Pair> queue = new LinkedList<>();
		int[][] dist = new int[n][m];
		boolean[][] chk = new boolean[n][m];
		queue.add(new Pair(0, 0));
		dist[0][0] = 1;
		chk[0][0] = true;
		
		while (!queue.isEmpty()) {
			Pair point = queue.remove();
			int x = point.x;
			int y = point.y;
			int nx;
			int ny;
			
			for (int k = 0; k < 4; k++) {
				nx = x + dx[k];
				ny = y + dy[k];

				if (0 <= nx && nx < n && 0 <= ny && ny < m) {
					if (chk[nx][ny] == false && miro[nx][ny] == 1) {
						queue.add(new Pair(nx, ny));
						dist[nx][ny] = dist[x][y] + 1;
						chk[nx][ny] = true;

					}
				}
			
			}
		}
		
		System.out.println(dist[n-1][m-1]);

	}

}
