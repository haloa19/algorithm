package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Stack_3986 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			
			Stack<String> stack = new Stack<>();
			String word = br.readLine();
			
			for(int j = 0; j < word.length(); j++) {
				
				String tmp = String.valueOf(word.charAt(j));
				
				if(!stack.isEmpty()) {
					if(stack.peek().equals(tmp)) {
						stack.pop();
					}
					else {
						stack.push(tmp);
					}
				}
				else {
					stack.push(tmp);
				}
			}
			
			
			if(stack.isEmpty()) {
				cnt++;
			}

			
		}
		
		System.out.println(cnt);

	}

}
