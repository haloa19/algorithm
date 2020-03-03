package programmers;

import java.util.Arrays;

public class numKth {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
			int s = commands[i][0];
			int e = commands[i][1];	
			int k = commands[i][2];
			int[] tmp = new int[e - s + 1];
			
			for (int j = 0; j < tmp.length; j++) {
				tmp[j] = array[s - 1];
				s++;
			}
			Arrays.sort(tmp);
			answer[i] = tmp[k-1];
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}		

	}

}
