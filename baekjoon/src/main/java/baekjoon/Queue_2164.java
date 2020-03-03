package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Queue queue = new LinkedList();
		
		int N = scanner.nextInt();
		int order = 1;
		
		for(int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		
		while(queue.size() != 1) {
			if(order % 2 != 0) {
				queue.poll();
			}
			else {
				queue.offer(queue.poll());
			}
			order++;
		}
		System.out.println(queue.peek());

	}

}
