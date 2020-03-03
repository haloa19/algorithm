package baekjoon;

import java.util.Scanner;

public class Array1_4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int c = scanner.nextInt();	
		
		for(int i = 0; i < c; i++) {
			int num = scanner.nextInt();
			int num_array[] = new int[num];
			
			double percent = 0;
			int sum = 0;
			int mean = 0;
			int cnt = 0;
			
			for(int j = 0; j < num; j++) {
				num_array[j] =  scanner.nextInt(); 
				sum += num_array[j];
			}
			mean = sum/num;
			
			for(int j = 0; j < num; j++) {
				if(num_array[j] > mean) {
					cnt++;
				}
			}

			percent = (cnt/(double)num) * 100;
			System.out.println(String.format("%.3f", percent)+"%");
		}

	}

}
