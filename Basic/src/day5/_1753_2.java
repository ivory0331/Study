package day5;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _1753_2 {
	static int INF = 100000000;
	static ArrayList<Pair>[] list;
	static int d[];
	
	public static class Pair implements Comparable<Pair>{
		int index;
		int distance;
		
		Pair(int index, int distance){
			this.index = index;
			this.distance = distance;
		}

		@Override
		public int compareTo(Pair o) { // �켱���� ť�� ���ϵ� ��� ���ı����� ����ġ�� �����ִ� ��
			return distance <= o.distance ? -1 : 1; // ���ڰ� ������ �켱����
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt(); // ��� ����
		int e = sc.nextInt(); // �Ÿ� ��
		int k = sc.nextInt(); // ���� ��� index
		
		list = new ArrayList[v+1];
		d = new int[v+1];
		
		for(int i=1; i<=v; i++) { // �ʱ�ȭ
			d[i] = INF;
			list[i] = new ArrayList<Pair>();
		}
		for(int i=1; i<=e; i++) {
			list[sc.nextInt()].add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		
		dijkstra(k);
		
		for(int i=1; i<=v; i++) {
			if(d[i]==INF)
				System.out.println("INF");
			else
				System.out.println(d[i]);
		}
		
	}

	private static void dijkstra(int start) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		
		d[start] = 0;
		pq.offer(new Pair(start, 0));
		
		while(!pq.isEmpty()) {
			Pair p = pq.poll();
			int current = p.index;
			int distance = p.distance;
			
			if(d[current]<distance)
				continue;
			for(int i=0; i<list[current].size(); i++) {
				int next = list[current].get(i).index;
				int nextDistance = distance + list[current].get(i).distance;
				
				if(nextDistance < d[next]) { // ����ִ��� �� ���� ũ��
					d[next] = nextDistance; // �ٲٱ�
					pq.offer(new Pair(next, nextDistance));
				}
			}
			
		}
		
	}

}
