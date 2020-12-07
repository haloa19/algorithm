package programmers;

import java.util.ArrayList;
import java.util.List;

public class FullSearch_MathTest {

	public static void main(String[] args) {		
		int[] answers = {1, 1, 3, 3};
		int[][] student = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
		
		int length = answers.length;
		int j = 1;
		int count = 0;
		int[] score = new int[3];
		
		for(int s = 0; s < 3; s++) {			
			for(int i = 0; i < length; i++) {
				if(answers[i] == student[s][j-1]) {
					count++;
				}
				j++;
				if(j > student[s].length) {
					j = 1;
				}
			}
			score[s] = count;
			count = 0;
			j = 1;
		}
	
		List<Integer> list = new ArrayList<Integer>();	
		int max = Math.max(score[0], Math.max(score[1], score[2]));
		
		for(int i = 0; i < 3; i++) {
			if(score[i] == max) {
				list.add(i+1);
			}
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
	}

}
