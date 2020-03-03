package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class Printer2 {

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int tmp : priorities) {
			queue.add(tmp);
		}
		
		Arrays.sort(priorities);
		int idx = priorities.length - 1;
		int max = priorities[idx];
		int cnt = 0;
		
		while (true) {
			if (queue.peek() == max) {
				if (location == 0) {
					System.out.println(cnt + 1);
					break;
				} else {
					queue.poll();
					cnt += 1;
					location -= 1;
					idx -= 1;
					max = priorities[idx];
				}
			} else {
				if (location == 0) {
					location = queue.size() - 1;
					queue.add(queue.poll());
				} else {
					queue.add(queue.poll());
					location -= 1;
				}
			}
		}
 
	}

}
