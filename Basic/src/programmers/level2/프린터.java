package programmers.level2;

import java.util.*;

public class ������ {

	public static void main(String[] args) {
		int[] priorties = {1,1,9,1,1,1};
		int location = 0;
		int answer = 1;
		
		PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int priority : priorties) {
			pque.add(priority); // ������ �ֱ�
		}
		
		while(!pque.isEmpty()) { // 9 1 1 1 1 1 
			for(int i=0; i<priorties.length; i++) {
				
				if(pque.peek() == priorties[i]) { // 1 == p[5]1
					if(location == i) { 
						pque.clear();
						break;
					}
					pque.poll(); // ������ ������
					answer++; // 2 1 1 1 = 5
				}
				
			}
		}
		
		System.out.println(answer);

	}

}
