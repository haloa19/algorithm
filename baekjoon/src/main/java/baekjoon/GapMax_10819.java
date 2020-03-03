package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class GapMax_10819 {
	
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

	public static int maxGap(int arr[]) {
		int sum = 0;		
		for (int i = 1; i < arr.length; i++) {
			sum += Math.abs(arr[i] - arr[i-1]);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] a = new int[n]; 	
		
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		Arrays.sort(a);		
		int max = 0;
		
		do {
			int sum = maxGap(a);
			//max = (sum > max) ? sum : max;
			max = Math.max(max, sum);
			
		} while (next_permutation(a));
		
		System.out.println(max);

	}

}
