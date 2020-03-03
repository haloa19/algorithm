package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Printer {

	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		int i = 0;
		int max = 0;
		
		for (int tmp : priorities) {
			max = (max < tmp) ? tmp : max;
			map.put(i, tmp);
			i += 1;
		}
		
		Arrays.sort(priorities);
		int cnt = 0;
		int idx = priorities.length;
		while(true) {
			Set<Integer> keySet = map.keySet();
			Iterator<Integer> keyIterator = keySet.iterator();
			Integer key = keyIterator.next();
			
			if (map.get(key) == max && key == location) {
				System.out.println(cnt + 1);
				break;
			} else if (map.get(key) == max) {
				map.remove(key);
				max = priorities[idx];
				cnt += 1;
				idx -= 1;
			} else {
				map.put(key, map.remove(key));
			}		
		}
 
	}

}
