package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DFSBFS_1260 {
	static ArrayList<Integer>[] a;
	static boolean[] chk;
	
	static void dfs(int start) {
		if (chk[start]) {
			return;
		}
		chk[start] = true;
		System.out.print(start + " ");
		for (int y : a[start]) {
			if (chk[y] == false) {
				dfs(y);
			}
		}
	}
	
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		chk[start] = true;		
		while (!queue.isEmpty()) {
			int x = queue.remove();
			System.out.print(x + " ");
			for(int y : a[x]) {
				if(chk[y] == false) {
					queue.add(y);
					chk[y] = true;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int start = scanner.nextInt();
		
		a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			a[x].add(y);
			a[y].add(x);
		}
		
		for(int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
		}
		chk = new boolean[a.length];
		dfs(start);
		System.out.println();
		chk = new boolean[a.length];
		bfs(start);		
	}

}
