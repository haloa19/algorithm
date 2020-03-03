package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Hash_5052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			for(int j = 0; j < m; j++) {
				String phone_num = br.readLine();
				map.put(j, phone_num);
			}
			for(int j = 0; j < m-1; j++) {
				for(int k = j+1; k < m; k++) {
					for(int t = 0; t < map.get(j).length(); t++) {
						String tmp = String.valueOf(map.get(j).charAt(t));
						String tmp2 = String.valueOf(map.get(k).charAt(t));
						
					}
				}
			}
		}
	}

}
