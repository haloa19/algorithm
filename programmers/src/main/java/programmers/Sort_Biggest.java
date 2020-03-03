package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Sort_Biggest {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		String[] arr = new String[numbers.length];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < numbers.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));
		//Arrays.sort(arr);
		if (arr[0].equals("0")) {
			sb.append(0);
		} else {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
			}
		}
		System.out.println(sb.toString());

	}

}
