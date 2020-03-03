package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Password_1759 {
	
	public static boolean check(String psw) {
		int ja = 0;
		int mo = 0;
		for (String tmp : psw.split("")) {
			if (tmp.equals("a") || tmp.equals("e") || tmp.equals("i") || tmp.equals("o") || tmp.equals("u")) {
				mo += 1;
			} else {
				ja += 1;
			}
		}
		
		return mo >= 1 && ja >= 2;
	}
	
	public static void password(int a, String[] arr, String psw, int i) {
		if (psw.length() == a) {
			if (check(psw)) {
				System.out.println(psw);
			}
			return;
		}
		if (arr.length <= i) return;
		
		password(a, arr, psw + arr[i], i+1);
		password(a, arr, psw, i+1);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.nextLine();
		String[] arr = scanner.nextLine().split(" ");
		
		Arrays.sort(arr);		
		password(a, arr, "", 0);

	}

}
