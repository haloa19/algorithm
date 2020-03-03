package baekjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Sort_1427 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* 1. 배열 */
		/*
		String num = scanner.nextLine();
		String[] n_array = num.split("");
		
		
		for(int key = 1; key < n_array.length; key++) {
			
			String tmp = n_array[key];
			
			for(int j = key-1; j >= 0; j--) {
				if(Integer.parseInt(tmp) > Integer.parseInt(n_array[j])) {
					n_array[j+1] = n_array[j];
					n_array[j] = tmp;			
				}
			}
		}
		for(int i = 0; i < n_array.length; i++) {
			System.out.print(n_array[i]);
		}*/
		
		
		/* 2. Linkedlist */
		String num = scanner.nextLine();
		LinkedList<String> n_list = new LinkedList<String>();
		
		for(int i = 0; i < num.length(); i++) {
			n_list.add(num.split("")[i]);
		}
		
        for(int key = 1; key < n_list.size(); key++) {
			
			for(int j = key-1; j >= 0; j--) {
				if(Integer.parseInt(n_list.get(j+1)) > Integer.parseInt(n_list.get(j))) {
					n_list.add(j, n_list.get(j+1));	
					n_list.remove(j+2);
				}
			}
		}
		
        for(int i = 0; i < n_list.size(); i++) {
        	System.out.print(n_list.get(i));
        }
	}
}
