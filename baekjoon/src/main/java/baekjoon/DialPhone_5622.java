package baekjoon;

import java.util.Scanner;

public class DialPhone_5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char[] num = scanner.nextLine().toCharArray();
		int time = 0;
		
		for (char tmp : num) {
			if ('A' <= tmp && 'C' >= tmp) time += 3;
			else if ('D' <= tmp && 'F' >= tmp) time += 4;
			else if ('G' <= tmp && 'I' >= tmp) time += 5;
			else if ('J' <= tmp && 'L' >= tmp) time += 6;
			else if ('M' <= tmp && 'O' >= tmp) time += 7;
			else if ('P' <= tmp && 'S' >= tmp) time += 8;
			else if ('T' <= tmp && 'V' >= tmp) time += 9;
			else time += 10;
		}
		
		System.out.println(time);

	}

}
