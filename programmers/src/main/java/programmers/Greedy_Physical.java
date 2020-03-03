package programmers;

public class Greedy_Physical {
	
	static int Count(int n, int[] lost, int[] reserve) {
		
		int[] tmp = new int[n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < lost.length; j++) {
				if(i + 1 == lost[j]) {
					tmp[i] -= 1;
				}
			}
			for(int j = 0; j < reserve.length; j++) {
				if(i + 1 == reserve[j]) {
					tmp[i] += 1;
				}
			}
		}
		
		int[] tmp2 = Borrow(tmp);
		int cnt = 0;
		
		for(int i = 0; i < tmp2.length; i++) {
			if(tmp2[i] >= 0) {
				cnt++;
			}
		}
		
		return cnt;
		
	}
	
	static int[] Borrow(int[] tmp) {
		
		for(int i = 0; i < tmp.length; i++) {
			if(i != 0 && tmp[i] == 1) {
				if(tmp[i - 1] == -1) {
					tmp[i] = 0;
					tmp[i - 1] = 0;
				}
			}
		}
		
		for(int i = 0; i < tmp.length - 1; i++) {
			if(tmp[i] == 1) {
				if(tmp[i + 1] == -1) {
					tmp[i] = 0;
					tmp[i + 1] = 0;
				}
			}
		}
		
		return tmp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[] lost = {3};
		int[] reserve = {3};
		
		int answer = Count(n, lost, reserve);
		System.out.println(answer);
		
	}

}
