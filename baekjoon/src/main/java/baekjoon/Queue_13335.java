package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Queue_13335 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> bridge = new LinkedList<>();
		//StringTokenizer st = new StringTokenizer(scanner.nextLine());
		
		int car_num = scanner.nextInt();
		int cnt = car_num;
		int bridge_length = scanner.nextInt();
		int max_weight = scanner.nextInt();
		int weight_sum = 0;
		int total_time = 0;
		
		for(int i  = 0; i < car_num; i++) {
			int car_weight = scanner.nextInt();

			
			if(bridge.isEmpty()) {
				bridge.offer(car_weight);
				weight_sum = weight_sum + car_weight;
				if(car_num == 1) {
					total_time = total_time + bridge_length + 1;
				}
			}
			else {
				if(((weight_sum + car_weight) <= max_weight) && ((bridge.size() + 1) <= bridge_length)) {
					bridge.offer(car_weight);
					weight_sum = weight_sum + car_weight;
				}
				else {		
						if(bridge.size() == 1) {
							if(i < car_num-1) {
								total_time = total_time + bridge_length;
								weight_sum = weight_sum - bridge.peek();
								bridge.poll();
								bridge.offer(car_weight);
								weight_sum = weight_sum + bridge.peek();
							}
							else {
								total_time = total_time + bridge_length + 1;
								weight_sum = weight_sum - bridge.peek();
								bridge.poll();
								bridge.offer(car_weight);
								weight_sum = weight_sum + bridge.peek();
							}
						}
						else {
							if(i < car_num-1) {
								total_time = total_time + (((bridge_length * bridge.size())-((bridge_length-1) * (bridge.size()-1))));
								while(bridge.size() != 0) {
									weight_sum = weight_sum - bridge.peek();
									bridge.poll();
								}
								bridge.offer(car_weight);
								weight_sum = weight_sum + bridge.peek();
								
							}
							else {
								total_time = total_time + (((bridge_length * bridge.size())-((bridge_length-1) * (bridge.size()-1))));
							    while(bridge.size() != 0) {
							    	weight_sum = weight_sum - bridge.peek();
							    	bridge.poll();
							    }
							    bridge.offer(car_weight);
							    total_time = total_time + bridge_length + 1;
							}
						}
						
				}
			}

		}
		
		System.out.println(total_time);
		
	}

}
