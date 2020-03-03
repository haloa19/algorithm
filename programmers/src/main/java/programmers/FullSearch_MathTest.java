package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FullSearch_MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] answers = {7};
		int[] stu1 = {1, 2, 3, 4, 5};
		int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] stu3 = {3, 3, 1, 1, 2, 2, 3, 3, 4, 5, 5};
		
		int size = answers.length;
		
		int score[] = new int[3];
		int cnt = 0;
		//List<Integer> result = new ArrayList<Integer>();
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		int j = 0;
		int num = 0;
		
		while(num < 3) {
			
			if(num == 1) {
				stu1 = stu2;
				j = 0;
			}
			else if(num == 2) {
				stu1 = stu3;
				j = 0;
			}
			
			for(int i = 0; i < size; i++) {
				if(stu1.length <= j) {
					j = 0;
					if(answers[i] == stu1[j]) {
						cnt++;
					}
				}
				else {
					if(answers[i] == stu1[j]) {
						cnt++;
					}
				}
				j++;
			}
			
			if(cnt != 0) {
				result.put(num + 1, cnt);
			}
			cnt = 0;
			num++;
			
		}
		
		
		/*
		
		//result.add(1);
		for(int i = 0; i < 3; i++) {
			if(score[i] != 0) {
				int max = score[i];
				result.add(i);
			}
			if(max < score[i]) {
				max = score[i];
				result.remove(0);
				result.add(i+1);
			}
			else if(max == score[i]) {
				result.add(i+1);
			}
		}
		
		int[] answer = new int[result.size()];
		
		for(int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
			System.out.println(answer[i]);
		}
		*/
	}

}
