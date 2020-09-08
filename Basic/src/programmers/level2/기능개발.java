package programmers.level2;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		int[] answer = {};
		Queue<Integer> que = new ConcurrentLinkedQueue<>(); // que에 각각 걸리는 일수 넣어놓기
		
		for(int i=0; i<progresses.length; i++) {
			que.add((100-progresses[i])%speeds[i]==0 ?(100-progresses[i])/speeds[i] : (100-progresses[i])/speeds[i] + 1);
		}
		
		ArrayList<Integer> list = new ArrayList<>(); // answer에 들어갈 것
		int prev = que.poll(); // remove랑 같은 기능. 맨 처음에 넣은 데이터를 꺼낸다.
		int num = 1; // 베포 날짜
		
		while(!que.isEmpty()) { // que가 바닥날때까지
			int cur = que.poll(); // prev의 그 다음꺼
			if(prev >= cur) num++;
			else {
				list.add(num); // 이전에 더해놓은것 넣어놓기
				num = 1; // num 다시 초기화
				prev = cur; // 그 다음 배포일 보기
			}
		}
		list.add(num);
		
		answer = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		for(int ans : answer) {
			System.out.print(ans+" ");
		}
		
	}
}
