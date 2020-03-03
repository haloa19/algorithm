package baekjoon;

import java.util.Scanner;

public class Array1_3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tmp = 0;
		int cnt_tmp = 0;
		int cnt = 0;
		int r[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			tmp = scanner.nextInt();
			r[i] = tmp % 42;
			
			if(i != 0) {
				for(int j = 0; j < i; j++) {
					if(r[i] == r[j]) {
						cnt_tmp++;
					}
				}
				if(cnt_tmp == 0) {
					cnt++;
				}
			} else {
				cnt++;
			}
			cnt_tmp = 0;
		}
		System.out.println(cnt);
		
	}

}
