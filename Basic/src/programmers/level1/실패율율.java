package programmers.level1;

import java.util.*;

class Node implements Comparable<Node> {
	int stage;
	double rate;
	public Node(int stage, double rate) {
		this.stage = stage;
		this.rate = rate;
	}
	@Override
	public int compareTo(Node a) {
		return Double.compare(a.rate, this.rate);
	}
}

public class �������� {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		int[] answer = new int[N];
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int s: stages) {
			map.put(s, map.getOrDefault(s, 0)+1); // ã�� Ű�� ������ Ű�� �� ��ȯ ������ �⺻�� ��ȯ
			// {1=1, 2=3, 3=2, 4=1, 6=1}
		}
		
		int total = stages.length;
		Node[] nodes = new Node[N];
		
		for(int i=1; i<=N; i++) {
			if(!map.containsKey(i)) { //containsKey �ش� map�� Ű�� �ִ��� ������ boolean Ÿ������ ����
				nodes[i-1] = new Node(i,0); // ������ 0�־��ֱ�
				continue;
			}
			int cnt = map.get(i);
			nodes[i-1] = new Node(i, (double)cnt/total); // ������ ����ؼ� �ֱ�
			total -= cnt;
		}
		Arrays.sort(nodes); // ���� (rate ��������)
		
		// nodes�� �ִ� �� answer�� �־��ֱ� 
		for(int i=0; i<N; i++) {
			answer[i] = nodes[i].stage;
		}
		
		// �� ���
		for(int ans: answer) {
			System.out.print(ans+" ");
		}
	}

}
