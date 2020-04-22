package programmers;

import java.io.IOException;

public class Test {

    public static int readInt() {
        int input = 0;
        int result1 = 0;
        try {
           input = System.in.read();
           if(!(input > '0' && input <= '9') && !(input == '.')) {
         	  result1 = -1;
           } else {
           while(input>'0' && input <='9') {
              result1 = (result1 * 10) + (input - '0');
              input = System.in.read();
              if(!(input > '0' && input <= '9') && !(input == '.')) {
            	  result1 = -1;
              }
           }
           }
        } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        return result1;
     }
     
     public static float readFraction() {
        int input = 0;
        float result2 = 0;
        try {
           float dividend = 1;
           input = System.in.read();
           while(input>'0' && input <='9') {
              dividend = dividend * 10;
              result2 = result2 + (input - '0') / dividend;
              input = System.in.read();
           }
        } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        return result2;
     }
     
     public static void main(String[] args) throws IOException  {
        // 정수부
        int result1 = readInt();

 
        if (result1 != -1) {
        	// 정수부
            System.out.println(result1);
           // 실수부
           float result2 = readFraction();
           System.out.println(result2);
        
           float result = result1 + result2;
           System.out.println(result);
        }
        else {
           System.out.println("Error: 실수가 아닙니다!");
        }
     }

}
