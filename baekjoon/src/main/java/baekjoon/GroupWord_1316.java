package baekjoon;

import java.util.Scanner;

public class GroupWord_1316 {
	
	public static boolean check(String str) {
		String[] word = str.split("");
		boolean flag = true;
		
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < i; j++) {
				if (!word[i].equals(word[i-1]) && word[i].equals(word[j])) {
					flag = false;
					break;
				}
			}
		}
		
		return flag;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String str = scanner.next();	
			if (check(str)) {
				cnt += 1;
			}
		}
		System.out.println(cnt);

	}

}
