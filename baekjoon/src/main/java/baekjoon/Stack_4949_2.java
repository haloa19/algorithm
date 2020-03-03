package baekjoon;

import java.util.Scanner;
import java.util.Stack;


public class Stack_4949_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String str = scanner.nextLine();
			Stack<String> stack = new Stack<String>();
			int chk = 0;
			
			if (str.equals(".")) {
				return;
			} else {
				for (String tmp : str.split("")) {
					if (tmp.equals("(") || tmp.equals("[")) {
						stack.add(tmp);
					} else if (tmp.equals(")") || tmp.equals("]")) {
						if (stack.isEmpty()) {
							chk++;
							break;
						} else {
							if ((tmp.equals(")") && stack.peek().equals("(")) || (tmp.equals("]") && stack.peek().equals("["))) {
								stack.pop();
							} else {
								chk++;
								break;
							}
						}
					}
				}
			}
			// �ݴ� ��ȣ�� ������ ��� �ұ����ε� chk == 0�̶� �������� ���Ծ���
			System.out.println((chk == 0 && stack.size() == 0) ? "yes" : "no");
		}

	}

}
