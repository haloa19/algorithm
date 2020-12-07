package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sort_11004 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n_array[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			n_array[i] = Integer.parseInt(st.nextToken());
		}
		
		int mid = n_array[(int) Math.floor(n/2)];
		System.out.println(mid);
	
		for(int i = 0; i < (int) Math.floor(n/2); i++) {
			if(n_array[i] > mid && n_array[i] > n_array[n-1]) {
				int tmp = n_array[i];
				n_array[i] = n_array[i-1];
				n_array[i-1] = tmp;
			}
		}

		System.out.println(n_array[k-1]);
	}

}
