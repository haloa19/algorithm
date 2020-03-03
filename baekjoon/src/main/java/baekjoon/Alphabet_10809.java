package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabet_10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		char[] chr = word.toCharArray();
		int[] arr = new int['z' - 'a' + 1];
		Arrays.fill(arr, -1);
		
		for (int i = 0; i < chr.length; i++) {
			if (arr[chr[i] - 'a'] == -1) {
				arr[chr[i] - 'a'] = i;
			}			
		}
		
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i] + " ";
		}
		System.out.println(ans);
		

	}

}
