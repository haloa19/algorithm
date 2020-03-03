package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hash_10546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String runner[][] = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			runner[i][0] = br.readLine();
		}
		
		for(int i = 0; i < n-1; i++) {
			String tmp = br.readLine();
			String tmp2 = tmp.substring(0, tmp.length()/2);
			
			exit_a:
				for(int j = 0; j < n; j++) {
					if(runner[j][0].startsWith(tmp2)) {
						System.out.println(tmp2);
						if(runner[j][0].equals(tmp)) {
							if(runner[j][1] == null) {
								runner[j][1] = tmp;
								System.out.println(runner[j][1]);
								break exit_a;
							}
						}
					}
					
				}
			
		}
		
		for(int i = 0; i < n; i++) {
			if(runner[i][1] == null) {
				System.out.println(runner[i][0]);
				break;
			}
		}

	}

}
