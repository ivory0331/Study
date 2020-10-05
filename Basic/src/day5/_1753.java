package day5;

import java.util.*;

class Node implements Comparable<Node>{
    int end, weight;

    public Node(int end, int weight){
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}

public class _1753 {

	static int v,e,k;
	static List<Node>[] list;
	static int[] d;
	static int INF = 100000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt(); // ��� ����
		e = sc.nextInt(); // ���� ����
		k = sc.nextInt(); // ���� ��� index
		
		list = new ArrayList[v+1];
		d = new int[v+1];

		for(int i=1; i<=v; i++) { // �ʱ�ȭ
			d[i] = INF;
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<e; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();
			// start ���� end �� ���� weight ����ġ
			list[start].add(new Node(end, weight));
		}
		
		dijkstra(k);
		
		// ���
		for(int i=1; i<=v; i++) {
			if(d[i]!=INF)
				System.out.println(d[i]);
			else
				System.out.println("INF");
		}
		
	}
	
	private static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] ch = new boolean[v+1];
		// �ʱⰪ ����
		d[start] = 0;
		pq.add(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			int cur = curNode.end;
			
			if(ch[cur]==true) continue; // �˻��� ����� ��� ����
			ch[cur] = true; // true�� ǥ��
			
			for(Node n : list[cur]) {
				if(d[n.end]>d[cur]+n.weight) {
					d[n.end] = d[cur]+n.weight;
					pq.add(new Node(n.end, d[n.end]));
				}
			}
			
		}
		
	}

}
