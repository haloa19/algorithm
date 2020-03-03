package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShortPerson_2309 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int total = 0;
		
		for (int i = 0; i < 9; i++) {
			list.add(scanner.nextInt());
			total += list.get(i);
		}
		
		a : for (int i = 0; i < 8; i++) {
				for (int j = i + 1; j < 9; j++) {
					if (total - (list.get(i) + list.get(j)) == 100) {
						list.remove(i);
						list.remove(j-1);
						break a;
					}
				}
		}
		Collections.sort(list);
		
		for (int tmp : list) {
			System.out.println(tmp);
		}

	}

}
