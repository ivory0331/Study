package programmers.level2;

import java.util.*;

public class 프린터 {

	public static void main(String[] args) {
		int[] priorties = {1,1,9,1,1,1};
		int location = 0;
		int answer = 1;
		
		PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int priority : priorties) {
			pque.add(priority); // 데이터 넣기
		}
		
		while(!pque.isEmpty()) { // 9 1 1 1 1 1 
			for(int i=0; i<priorties.length; i++) {
				
				if(pque.peek() == priorties[i]) { // 1 == p[5]1
					if(location == i) { 
						pque.clear();
						break;
					}
					pque.poll(); // 데이터 꺼내기
					answer++; // 2 1 1 1 = 5
				}
				
			}
		}
		
		System.out.println(answer);

	}

}
