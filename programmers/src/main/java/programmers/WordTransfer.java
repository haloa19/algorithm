package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class WordTransfer {
	static boolean[] chk;
	static int answer = 1;
	
	public static int dfs(String begin, String target, String[] words) {
		Queue<String> queue = new LinkedList<String>();
		queue.add(begin);
		boolean check = false;
		
		while (!queue.isEmpty()) {
			String tmp = queue.poll();

			if (tmp.equals(target)) {
				check = true;
				break;
			} else {
				for (int i = 0; i < words.length; i++) {
					int a = countMatches(tmp, words[i]);
					if (chk[i] == false) {
						if (a == 1) {
							if (queue.isEmpty()) answer += 1;
							queue.add(words[i]);
							chk[i] = true;
						}
					}
				}
			}
		}
		return (check) ? answer : 0;
	}
	
	public static int countMatches(String a, String b) {
		int cnt = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				cnt += 1;
			}
		}
		if (cnt == a.length() - 1) return 1;
		else return -1;		
	}

	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog"; 
		String[] words = {"hot", "dot", "dog", "lot", "log"};
		
		chk = new boolean[words.length];
		System.out.println(dfs(begin, target, words));

	}

}
