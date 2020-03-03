package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Virus_2606 {
	static ArrayList<Integer>[] a;
	
	static int virus() {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] chk = new boolean[a.length];
		int cnt = 0;
		queue.add(1);
		chk[1] = true;
		
		while (!queue.isEmpty()) {
			int x = queue.remove();
			cnt++;
			for(int y : a[x]) {
				if(chk[y] == false) {
					queue.add(y);
					chk[y] = true;
				}
			}
		}
		
		return cnt;		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		a = new ArrayList[n + 1];
		
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			a[x].add(y);
			a[y].add(x);
		}
		
		int cnt = virus();
		
		System.out.println(cnt-1);

	}

}
