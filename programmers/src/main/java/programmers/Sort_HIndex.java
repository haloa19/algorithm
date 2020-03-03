package programmers;

import java.util.Arrays;

public class Sort_HIndex {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		int answer = 0;
		
		Arrays.sort(citations);
		
		for (int i = 0; i < citations.length; i++) {
			if ((citations.length - i) == citations[i] && (i + 1) == citations[i]) {
				answer = citations[i];
				break;
			}
		}
		System.out.println(answer);

	}

}
