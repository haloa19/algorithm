package baekjoon;

import java.util.Scanner;

public class VisitPermutation_10971 {
	
	public static boolean next_permutation(int[] a) {	
		int i = a.length - 1;
		while (i > 0 && a[i-1] >= a[i]) {
			i -= 1;
		}
		
		if (i <= 0) {
			return false;
		}
		
		int j = a.length - 1;
		while (a[i-1] >= a[j]) {
			j -= 1;
		}
		
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		j = a.length - 1;
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i += 1;
			j -= 1;
		}
		
		return true;
	}
	
	public static int cost(int[] a, int[][] w) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				if (w[a[i]-1][a[i+1]-1] != 0) {
					sum += w[a[i]-1][a[i+1]-1];
				} else {
					sum = 0;
					return sum;
				}
			} else {
				if (w[a[i]-1][a[0]-1] != 0) {
					sum += w[a[i]-1][a[0]-1];
				} else {
					sum = 0;
					return sum;
				}
			}
			
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int w[][] = new int[n][n];
		int a[] = new int[n];
		int min = 0;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				w[i][j] = scanner.nextInt();
			}
			a[i] = i + 1;
		}
		
		do {
			sum = cost(a, w);
			if (sum > 0) {
				min = (min > sum) || (min == 0) ? sum : min;
			}
			
			
		} while (next_permutation(a) && a[0] == 1);
					
		System.out.println(min);

	}

}
