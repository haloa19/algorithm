package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queue_2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		
		int N = Integer.parseInt(bf.readLine());
		int[] top = new int[N];
		int cnt = 0;
		String result = "0";
		String height = "";
		
		while(height.length() < (2 * N) - 1) {
			height = height + bf.readLine();
			System.out.println(height.length());
		}
		System.out.println(height);
		
		for(int i = 0; i < N; i++) {		
			top[i] = Integer.parseInt(height.split(" ")[i]);
		}
		
		
		for(int i = 1; i < N; i++) {
			exit_a:
				for(int j = i - 1; j >= 0; j--) {
					if(top[i] < top[j]) {
						result = result + " " + (j+1);
						cnt++;
						break exit_a;
					}
				}
		if(cnt == 0) {
			result = result + " 0";
		}
		}
		System.out.println(result);		
		
	}

}
