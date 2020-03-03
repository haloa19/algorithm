package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Sort_11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		int[][] xy_array = new int[2][num];
		
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			xy_array[0][i] = Integer.parseInt(st.nextToken());
			xy_array[1][i] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(xy_array, new Comparator<int[]>() {
			
			@Override
            public int compare(int[] arr1, int[] arr2) {
				if(arr1[0] == arr2[0]) {
					return Integer.compare(arr1[1], arr2[1]);
				}
				else {
					return Integer.compare(arr1[0], arr2[0]);
				}
                	                
            }
       
        });
		
		
		
		for(int i = 0; i < num; i++) {
			sb.append(xy_array[0][i] + " " + xy_array[1][i]);
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb);
	}
	
}
