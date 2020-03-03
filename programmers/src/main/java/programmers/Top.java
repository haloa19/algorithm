package programmers;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Top {

	public static void main(String[] args) {
		int[] heights = {3,9,9,3,5,7,2};
		int[] answer = new int[heights.length];
		List<Integer> list = new LinkedList<Integer>();
		
		for (int i = heights.length - 1; i > 0; i--) {
			int j = i - 1;
			
			while (j >= 0) {
				if (heights[i] < heights[j]) {
					list.add(j + 1);
					break;
				} else if (j == 0 && !(heights[i] < heights[j])) {
					list.add(0);
				}
				j--;
			}
			
		}
		list.add(0);
		
		for (int i = 0, j = heights.length - 1; i >= 0; i++, j--) {
			answer[i] = list.get(j);
		}

	}

}
