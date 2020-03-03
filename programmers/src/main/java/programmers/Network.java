package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Network {
	static ArrayList<Integer>[] a;

	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		
		a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (computers[i][j] == 1 && i != j) {
					a[i + 1].add(j + 1);				
					a[j + 1].add(i + 1);
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
		}
		
		dfs();

	}
	
	public static void dfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] chk = new boolean[a.length];

		int cnt = 0;
		
		for (int i = 1; i < a.length; i++) {
			if (chk[i] == false) {
				queue.add(i);				
				chk[i] = true;
				cnt++;
				
				while (!queue.isEmpty()) {
					int x = queue.remove();
					for (int y : a[x]) {
						if (chk[y] == false) {
							queue.add(y);
							chk[y] = true;
						}
						
					}
					
				}
				
			}
	
		}
		
		System.out.println(cnt);

	}

}
