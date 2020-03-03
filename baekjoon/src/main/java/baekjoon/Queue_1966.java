package baekjoon;
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
