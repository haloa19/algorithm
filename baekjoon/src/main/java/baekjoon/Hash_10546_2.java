package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hash_10546_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int n = Integer.parseInt(br.readLine());
		String key = "";
		int cnt;
		
		for(int i = 0; i < n*2-1; i++) {
			key = br.readLine();
			if(map.containsKey(key)) {
				cnt = map.get(key) + 1;
				map.put(key, cnt);
			}
			else {
				map.put(key, 1);
			}
		}
		
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			key = iterator.next();
			
			if(map.get(key)%2 != 0) {
				System.out.println(key);
			}

		}
		
	}

}
