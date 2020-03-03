package baekjoon;

import java.util.Scanner;

public class ThreeNum_2985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a + b == c) System.out.println(a + "+" + b + "=" + c);
		else if (a - b == c) System.out.println(a + "-" + b + "=" + c);
		else if (a / b == c) System.out.println(a + "/" + b + "=" + c);
		else if (a * b == c) System.out.println(a + "*" + b + "=" + c);
		else if (a == b + c) System.out.println(a + "=" + b + "+" + c);
		else if (a == b - c) System.out.println(a + "=" + b + "-" + c);
		else if (a == b * c) System.out.println(a + "=" + b + "*" + c);
		else if (a == b / c) System.out.println(a + "=" + b + "/" + c);
		

	}

}
