package programmers.level2;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ��ɰ��� {

	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		int[] answer = {};
		Queue<Integer> que = new ConcurrentLinkedQueue<>(); // que�� ���� �ɸ��� �ϼ� �־����
		
		for(int i=0; i<progresses.length; i++) {
			que.add((100-progresses[i])%speeds[i]==0 ?(100-progresses[i])/speeds[i] : (100-progresses[i])/speeds[i] + 1);
		}
		
		ArrayList<Integer> list = new ArrayList<>(); // answer�� �� ��
		int prev = que.poll(); // remove�� ���� ���. �� ó���� ���� �����͸� ������.
		int num = 1; // ���� ��¥
		
		while(!que.isEmpty()) { // que�� �ٴڳ�������
			int cur = que.poll(); // prev�� �� ������
			if(prev >= cur) num++;
			else {
				list.add(num); // ������ ���س����� �־����
				num = 1; // num �ٽ� �ʱ�ȭ
				prev = cur; // �� ���� ������ ����
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
