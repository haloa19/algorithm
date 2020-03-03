package baekjoon;

import java.util.Scanner;

public class WordCount_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		int i = 0;
		boolean chk = false;
		int cnt = 0;
		
		while (i < str.length()) {
			char a = str.charAt(i);
			if(String.valueOf(a).equals(" ")) {
				if (chk) {
					cnt++;
					chk = false;
				}
			} else {
				if (i == str.length() - 1) {
					cnt++;
				} else {
					chk = true;
				}
			}
			i++;
		}
		System.out.println(cnt);

	}

}
