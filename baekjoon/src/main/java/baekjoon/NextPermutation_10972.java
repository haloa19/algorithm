package baekjoon;

import java.util.Scanner;

public class NextPermutation_10972 {
	
	public static boolean next_permutation(int[] a) {
		
		int i = a.length - 1;
		while (i > 0 && a[i-1] > a[i]) {
			i -= 1;
		}
		
		if (i <= 0) {
			return false;
		}
		
		int j = a.length - 1;
		while (a[i-1] > a[j]) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		if (next_permutation(a)) {
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			
		} else {
			System.out.println(-1);
		}

	}

}
