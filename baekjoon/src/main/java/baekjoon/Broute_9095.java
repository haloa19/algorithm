package baekjoon;

import java.util.Scanner;

public class Broute_9095 {
	
	public static void cal(int num) {
		int ans = 0;		
		for (int l1 = 1; l1 <= 3; l1++) {
			if (l1 == num) ans += 1;
			for (int l2 = 1; l2 <= 3; l2++) {
				if (l1 + l2 == num) ans += 1;
				for (int l3 = 1; l3 <= 3; l3++) {
					if (l1 + l2 + l3 == num) ans += 1;
					for (int l4 = 1; l4 <= 3; l4++) {
						if (l1 + l2 + l3 + l4 == num) ans += 1;
						for (int l5 = 1; l5 <= 3; l5++) {
							if (l1 + l2 + l3 + l4 + l5 == num) ans += 1;
							for (int l6 = 1; l6 <= 3; l6++) {
								if (l1 + l2 + l3 + l4 + l5 + l6 == num) ans += 1;
								for (int l7 = 1; l7 <= 3; l7++) {
									if (l1 + l2 + l3 + l4 + l5 + l6 + l7 == num) ans += 1;
									for (int l8 = 1; l8 <= 3; l8++) {
										if (l1 + l2 + l3 + l4 + l5 + l6 + l7 + l8 == num) ans += 1;
										for (int l9 = 1; l9 <= 3; l9++) {
											if (l1 + l2 + l3 + l4 + l5 + l6 + l7 + l8 + l9 == num) ans += 1;
											for (int l0 = 1; l0 <= 3; l0++) {
												if (l1 + l2 + l3 + l4 + l5 + l6 + l7 + l8 + l9 + l0 == num) ans += 1;
												
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			cal(num);
		}
 
	}

}
