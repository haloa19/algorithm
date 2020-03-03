package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair3 {
	int x;
	int y;
	
	Pair3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Island_4963 {
	static final int[] dx = {1, -1, 0, 0, -1, -1, 1, 1};
	static final int[] dy = {0, 0, 1, -1, -1, 1, -1, 1};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();;
		
		while(true) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			int island[][] = new int[n][m];
			
			if(n != 0 && m != 0) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						int tmp = scanner.nextInt();
						island[i][j] = tmp;
					}
				}
				
				Queue<Pair3> queue = new LinkedList<>();
				boolean[][] chk = new boolean[n][m];				
				int cnt = 0;				
					
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						if (island[i][j] == 1 && chk[i][j] == false) {
							queue.add(new Pair3(i, j));
							chk[0][0] = true;
							
							while (!queue.isEmpty()) {
								Pair3 point = queue.remove();
								int x = point.x;
								int y = point.y;
								int nx = 0;
								int ny = 0;
								
								for (int k = 0; k < 8; k++) {
									nx = x + dx[k];
									ny = y + dy[k];
									if (0 <= nx && nx < n && 0 <= ny && ny < m) {
										if (chk[nx][ny] == false && island[nx][ny] == 1) {
											queue.add(new Pair3(nx, ny));
											chk[nx][ny] = true;		
										}
									}
								}	
							}							
							cnt++;
						}						
					}
				}					
				
				num.add(cnt);
				
			}
			else {
				break;
			}
			
		}
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}

	}

}
