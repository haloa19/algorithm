package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<String> stack = new Stack<>();
		String str = "";
		StringTokenizer st;
		int cnt;
		int a = 0;
		
		exit_a:
			while(true) {
				cnt = 0;
				str = br.readLine();
				st = new StringTokenizer(str, "()[]", true);
				
				if(str.length() == 1 && st.nextToken().equals(".")) {					
					break exit_a;
				}
				else {
					while(st.hasMoreTokens()) {
						String tmp = st.nextToken();
						
						if(tmp.equals("(") || tmp.equals("[")) {
							stack.push(tmp);
							cnt++;
						}
						else if(tmp.equals(")")) {
							if(!stack.isEmpty()) {
								if(stack.peek().equals("(")) {
									stack.pop();
									cnt++;
								}
								
							}
							else {
								cnt++;
							}
					
						}		
						else if(tmp.equals("]")) {
							if(!stack.isEmpty()) {
								if(stack.peek().equals("[")) {
									stack.pop();
									cnt++;
								}
								
							}
							else {
								cnt++;
							}
					
						}	
						
					}
					
					if(cnt == 0) {
						System.out.println("yes");
					}
					else {
						if(stack.size() == 0) {
							System.out.println("yes");
						}
						else {
							System.out.println("no");
						}
					}
					
				}			
				
		}
		
	}

}
