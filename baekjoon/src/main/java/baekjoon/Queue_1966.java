package baekjoon;
/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int C = scanner.nextInt();
		
		
		for(int i = 0; i < C; i++) {
			
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			
			Queue q_num = new LinkedList();
			Queue q_idx = new LinkedList();
			
			int cnt = 0;
			int order = 1;
			
			for(int k = 0; k < N; k++) {
				q_num.offer(scanner.nextInt());
				q_idx.offer(k);
			}
			
			exit_a:
				while(q_num.size() > 0) {
					
					exit_b:
						for(int j = 1; j < q_num.size(); j++) {
						
							if((int)q_num.peek() < (int)((LinkedList) q_num).get(j)) {
								
								q_num.offer(q_num.poll());
								q_idx.offer(q_idx.poll());
								cnt++;
								break exit_b;  // �ش� Ű������ ū���� �Ѱ��� ������ �ڷ� ������ ���̻� ���� ���� ����
							}
						}
					// �ش� Ű���� ���� ũ�ٸ� ��� 
					
					if(cnt == 0) {
						
						if((int)q_idx.peek() == M) {
							System.out.println(order);
							break exit_a;
						}else {
							q_num.poll();
							q_idx.poll();
							order++;
						}
			
					}
					cnt = 0;
				}
			
		}

	}

}
*/





// ã�� ������ �߿䵵 �����ϴ� ����� �ٸ� �ڵ�

import java.util.*;

public class Queue_1966 {

    public static void main(String[] args) {

        class Document {
            public boolean check; 
            public int priority; 

            public Document(boolean check, int priority) {
                this.check = check;
                this.priority = priority;
            }

            @Override
            public String toString() {
                return "check: " + check + ", priority: " + priority;
            }
        }


        Scanner sc = new Scanner(System.in);

        int testCaseCount = sc.nextInt();

        while (testCaseCount > 0) {

            int documentCount = sc.nextInt();
            int qPos = sc.nextInt(); 
            int count = 0;

            Queue<Document> list = new LinkedList<>();

            for (int a = 0; a < documentCount; a++) {
                int priority = sc.nextInt();
                list.offer(new Document(qPos == a, priority));
            }

            while(!list.isEmpty()) {
                Document part = list.poll();

                Iterator<Document> it = list.iterator();
                boolean chk = false;

                while (it.hasNext()) {
                    if (part.priority < it.next().priority) {
                        chk = true;
                    }
                }

                if (chk) {
                    list.offer(part);
                } else {
                    if (part.check) {
                        System.out.println(++count);
                        break;
                    } else {
                        ++count;
                    }
                }
            }
            testCaseCount--;
        }

    }
}
