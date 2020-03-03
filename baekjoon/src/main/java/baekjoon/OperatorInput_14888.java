package baekjoon;

import java.util.Scanner;

public class OperatorInput_14888 {
	public static boolean next_permutation(int[] opAll) {
		
		int i = opAll.length - 1;
		while (i > 0 && opAll[i-1] >= opAll[i]) {
			i -= 1;
		}
		
		if (i <= 0) {
			return false;
		}
		
		int m = opAll.length - 1;
		while (opAll[i-1] >= opAll[m]) {
			m -= 1;
		}
		int temp = opAll[i-1];
		opAll[i-1] = opAll[m];
		opAll[m] = temp;
		
		m = opAll.length - 1;
		while (i < m) {
			temp = opAll[i];
			opAll[i] = opAll[m];
			opAll[m] = temp;
			i += 1;
			m -= 1;
		}
		return true;
	}
	
	public static int calculator(int[] opAll, int[] a) {
		int ans = a[0];
		
		for (int l = 1; l < a.length; l++) {
			if (opAll[l-1] == 1) {
				ans = ans + a[l];
			} else if (opAll[l-1] == 2) {
				ans = ans - a[l];
			} else if (opAll[l-1] == 3) {
				ans = ans * a[l];
			} else {
				ans = ans / a[l];
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		int op[] = new int[4];
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 4; i++) {
			op[i] = scanner.nextInt();
			sum += op[i];
		}
		
		int opAll[] = new int[sum];
		int j = 0;

		for (int k = 0; k < 4; k++) {
			for (int p = 0; p < op[k]; p++) {
				opAll[j] = k+1;
				j++;
			}
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		do {		
			int ans = calculator(opAll, a);
			min = (min > ans) ? ans : min;
			max = (max < ans) ? ans : max;
			
		} while(next_permutation(opAll));
		
		System.out.println(max);
		System.out.println(min);

	}

}
