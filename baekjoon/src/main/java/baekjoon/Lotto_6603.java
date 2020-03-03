package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Lotto_6603 {
	public static boolean next_permutation(int[] chk) {		
		int i = chk.length - 1;
		while (i > 0 && chk[i-1] <= chk[i]) {
			i -= 1;
		}
		
		if (i <= 0) {
			return false;
		}
		
		int j = chk.length - 1;
		while (chk[i-1] <= chk[j]) {
			j -= 1;
		}
		
		int temp = chk[i-1];
		chk[i-1] = chk[j];
		chk[j]= temp;
		
		j = chk.length - 1;
		while (i < j) {
			temp = chk[i];
			chk[i] = chk[j];
			chk[j] = temp;
			i += 1;
			j -= 1;					
		}
		
		return true;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int n = scanner.nextInt();
			int a[] = new int[n];
			int chk[] = new int[n];
			
			if (n == 0) {
				break;
			}
			
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				
				if (i < 6) {
					chk[i] = 1;
				} else {
					chk[i] = 0;
				}
			}
			
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
			
			do {
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				for (int i = 0; i < n; i++) {
					if (chk[i] == 1) {
						tmp.add(a[i]);
					}
				}
				ans.add(tmp);
				
			} while (next_permutation(chk));
			
			for (ArrayList<Integer> v : ans) {
                for (int x : v) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.println();
			
		}

	}

}
