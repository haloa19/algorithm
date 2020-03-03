package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_5397 {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));         
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
        	
        	Stack<String> s_result = new Stack<>();
    		Stack<String> s_cursor = new Stack<>();
        	
    		
    		char[] input = br.readLine().toCharArray();
    		
    		for(int j = 0; j < input.length; j++) {
    			
    			String tmp = String.valueOf(input[j]);
    		
        		if(s_cursor.isEmpty()) {
        			if(s_result.isEmpty()) {
        				if(!tmp.equals("<") && !tmp.equals(">") && !tmp.equals("-")) {
            				s_result.push(tmp);
            			}
        			}
        			else if(!s_result.isEmpty()){
        				
        				if(tmp.equals("<") | tmp.equals(">")) {
            				s_cursor.push(tmp);
            			}
        				else if(tmp.equals("-")) {
        					s_result.pop();
        				}
        				else {
        					
        					s_result.push(tmp);
        				}
        			}
        		}
        		else {
        			if(tmp.equals("<") | tmp.equals(">")) {
        				s_cursor.push(tmp);
        			}
        			else if(tmp.equals("-")) {
        				int cnt = 0;
        				while(!s_cursor.isEmpty()) {
        					if(s_cursor.peek().equals("<")) {
        						s_cursor.pop(); 
        						cnt++; 
        					}
        					else {
        						s_cursor.pop();
        						cnt--;
        					}
        				}
        				
        				if(cnt > 0) {
        					for(int k = 0; k < cnt; k++) {
            					if(!s_result.isEmpty()) {
            						s_cursor.push(s_result.pop());
            					}
            				}
        					
        					s_result.pop();
        					
        					for(int k = 0; k < cnt; k++) {
        						if(!s_cursor.isEmpty()) {
        							s_result.push(s_cursor.pop());
        						}
        					}
        					
        					while(!s_cursor.isEmpty()) {
        						s_cursor.pop();
        					}

        				}
        				else {
        					s_result.pop();
        				}
        				
        			}
        			else {
        				int cnt = 0;
        				while(!s_cursor.isEmpty()) {
        					if(s_cursor.peek().equals("<")) {
        						s_cursor.pop(); 
        						cnt++; 
        					}
        					else {
        						s_cursor.pop();
        						cnt--;
        					}
        				}
        				if(cnt > 0) {
        					for(int k = 0; k < cnt; k++) {
            					if(!s_result.isEmpty()) {
            						s_cursor.push(s_result.pop());
            					}
            				}
        					s_result.push(tmp);
        					
        					while(!s_cursor.isEmpty()) {
            					s_result.push(s_cursor.pop());
            				}
        				}
        				else {
        					s_result.push(tmp);
        				}
        				
        			}
    		    }	
    		
    		}
    		
    		StringBuilder answer = new StringBuilder();
            while(!s_result.isEmpty()){
                answer.append(s_result.pop());
            }

    		System.out.println(answer.reverse());
    	
        }
		
	}

}
