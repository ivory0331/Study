package programmers.level2;

import java.util.*;

public class ss { // 최대값 뽑아내기

	public static void main(String[] args) {
		int[] scoville = {12, 10, 9 ,3 ,2, 1};
		int K = 7;
		int answer = 0;
		
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int s:scoville)
			maxheap.add(s);
		
		System.out.println(maxheap.poll()+","+maxheap.poll());
		
	}

}
