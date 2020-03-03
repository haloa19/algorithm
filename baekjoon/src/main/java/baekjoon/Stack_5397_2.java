package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_5397_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			Stack<String> s_result = new Stack<>();
    		Stack<String> s_tmp = new Stack<>();
        	
    		char[] input = br.readLine().toCharArray();
    		
    		for(int j = 0; j < input.length; j++) {
    			String tmp = String.valueOf(input[j]);
    			
    			if(tmp.equals("<")) {
    				if(!s_result.isEmpty()) {
    					s_tmp.push(s_result.pop());
    				}
    			}
    			else if(tmp.equals(">")) {
    				if(!s_tmp.isEmpty()) {
    					s_result.push(s_tmp.pop());
    				}
    			}
    			else if(tmp.equals("-")) {
    				if(!s_result.isEmpty()) {
    					s_result.pop();
    				}
    			}
    			else {
    				s_result.push(tmp);
    			}
    		}
    		
    		while(!s_tmp.isEmpty()) {
    			s_result.push(s_tmp.pop());
    		}
    		
    		StringBuilder answer = new StringBuilder();
            while(!s_result.isEmpty()){
                answer.append(s_result.pop());
            }

    		System.out.println(answer.reverse());
		}
		
	}

}
