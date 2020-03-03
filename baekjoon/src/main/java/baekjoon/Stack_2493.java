package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_2493 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// scanner�� �Է� ���� ��� �޸� �ʰ� �߻�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        // ž�� ���̿� ��ġ�� ���� �����ϱ� ���� Pair Ŭ���� ����
		class TopInfo {
            
            public int idx;  // ž�� ����
            public int height;  // ž�� ����

            public TopInfo(int idx, int height) {
                this.idx = idx;
                this.height = height;
            }

            @Override
            public String toString() {
                return "index: " + idx + ", height: " + height;
            }
        }
		

		// ž�� ���� �Է�
		int N = Integer.parseInt(br.readLine());
		
		// ��� ������ ���ڿ� ����
		StringBuilder result = new StringBuilder();
		// ù��° ���� ������ 0 - ���� ������ ž�� ����
		result.append("0");
		
		// TopInfo�� ������ ���� ���� ����
		Stack<TopInfo> stack = new Stack<>();
		
		// ž ���� �Է� - ���ڿ��� token������ ������, ����Ʈ �� - ����
		StringTokenizer stk;
		stk = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			// ž ���̸� ��ū ������ �߶� ������
			int tmp = Integer.parseInt(stk.nextToken());
			
			// ù��° ž�� ������ 0
			if(i == 0) {
				stack.push(new TopInfo(i+1, tmp));
				
			} else {
				TopInfo part = stack.peek();
				
				/* ���1. ���� ž�� ���̺��� ���� ž�� ���̰� �� Ŭ ��� */
				if(tmp >= part.height) {
					
					// ���� ž �� ���� ž���� ���� ž�� �� ã�������� wile�� ����
					while(tmp >= part.height && stack.size() > 0) {
						
						if(!stack.isEmpty()) {
							
							// ���� ž���� ���� ž�� ����
							stack.pop();
							
							// ���� ž�� 1���� ���  while�� Ż��
							if(!stack.isEmpty()) {
								
								// ���� ���� ����
								part = stack.peek();
								
							}
					
						}
						
					}
					
					// ���� ž�� 1������ pop�� �� ���� ��� 
					if(stack.size() < 1) {
						result.append(" 0");
					}
					// ���� ž�� �����ִ� ���
					else {
						part = stack.peek();
						result.append(" " + part.idx);					
					}
					
					// ���� ž �ֱ�
					stack.push(new TopInfo(i+1, tmp));	
				
					
				} 
				/* ���2. ����ž�� ���̰� ���� ž���� ū ��� */
				else {
					result.append(" " + part.idx);
					stack.push(new TopInfo(i+1, tmp));
				}
				
				
			}
			
	   }
		System.out.println(result);
	}

}