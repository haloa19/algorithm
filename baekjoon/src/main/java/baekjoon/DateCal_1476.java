package baekjoon;

import java.util.Scanner;

public class DateCal_1476 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int e = scanner.nextInt();
		int s = scanner.nextInt();
		int m = scanner.nextInt();
		int E = 1; 
		int S = 1; 
		int M = 1;
		
		for (int i = 1; ; i++) {			
			if (e == E && s == S && m == M) {
				System.out.println(i);
				break;
			}
			E += 1;
			S += 1;
			M += 1;
			
			if (E == 16) E = 1;
			if (S == 29) S = 1;
			if (M == 20) M = 1;
		}
	
	}

}
