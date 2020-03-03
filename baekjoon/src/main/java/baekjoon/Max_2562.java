package baekjoon;

import java.util.Scanner;

public class Max_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num_array[] = new int[9];
		
		for(int i = 0; i < 9; i++) {
			num_array[i] = scanner.nextInt();
		}
		
		int max = num_array[0];
		int max_index = 1;
		
		for(int i = 1; i < 9; i++) {
			if(max < num_array[i]) {
				max = num_array[i];
				max_index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(max_index);		

	}

}
