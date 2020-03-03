package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair2 {
	int x;
	int y;
	
	Pair2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class TownNumber_2667 {
	static final int[] dx = {1, -1, 0, 0};
	static final int[] dy = {0, 0, 1, -1};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] town = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			String str = scanner.next();
			for (int j = 0; j < n; j++) {
				char[] chr = str.toCharArray();
				town[i][j] = chr[j] - '0';
			}
		}
		
		Queue<Pair2> queue = new LinkedList<Pair2>();
		boolean[][] chk = new boolean[n][n];
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = 0;
				if (town[i][j] == 1 && chk[i][j] == false) {
					queue.add(new Pair2(i, j));
					
					while (!queue.isEmpty()) {
						Pair2 point = queue.remove();
						int x = point.x;
						int y = point.y;
						int nx = 0;
						int ny = 0;
						
						for (int k = 0; k < 4; k++) {
							nx = x + dx[k];
							ny = y + dy[k];
							if(0 <= nx && nx < n && 0 <= ny && ny < n) {
								if(chk[nx][ny] == false && town[nx][ny] == 1) {
									queue.add(new Pair2(nx, ny));
									chk[nx][ny] = true;
								}
							}
						}
						tmp++;
					}
					if (tmp > 1) {
						num.add(tmp - 1);
					}
					else {
						num.add(tmp);
					}
				}
			}
		}
		System.out.println(num.size());
		Collections.sort(num);
		for(int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
	}

}
