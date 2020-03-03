package baekjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordStudy_1157 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().toUpperCase();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (String tmp : str.split("")) {
			if (map.containsKey(tmp)) {
				int cnt = map.get(tmp);
				map.put(tmp, ++cnt);
			} else {
				map.put(tmp, 1);
			}
			
		}
		
		Entry<String, Integer> maxEntry = null;
		ArrayList<String> list = new ArrayList<String>();
		int chk = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {			
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0 ) {
				maxEntry = entry;
				chk = 0;
			} else if (entry.getValue().compareTo(maxEntry.getValue()) == 0) {
				chk++;
			}
		}
		System.out.println((chk > 0) ? "?" : maxEntry.getKey());

	}

}
