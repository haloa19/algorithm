package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Stack_10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		int num = scanner.nextInt();
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			int tmp = scanner.nextInt();
			if(tmp == 0) {
				stack.pop();
			}
			else {
				stack.push(tmp);
			}
		}

		int size = stack.size();
		for(int i = 0; i < size; i++) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}

}
