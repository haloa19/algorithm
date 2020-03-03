package baekjoon;

import java.util.Scanner;

public class Decimal_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			boolean chk = true;
			
			if (num == 1) {
				chk = false;
				continue;
			} else {
				int j = 2;
				
				while (j < num) {
					if (num % j == 0) {
						chk = false;
						break;
					}
					j++;
				}	
				
			}			
			cnt = (chk) ? cnt + 1 : cnt;
		}
		System.out.println(cnt);

	}

}
