package programmers.level2;

import java.util.*;

public class ´õ¸Ê°Ô {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;
		
		PriorityQueue<Integer> sco = new PriorityQueue<>();
		for(int s : scoville)
			sco.add(s);
		
		while(sco.peek() <= K) {
			if(sco.size() == 1) answer = -1;
			
			int result = sco.poll() + (sco.poll()*2);
			sco.add(result);
			answer++;
		}
		
		System.out.println(answer);
		
	}

}
