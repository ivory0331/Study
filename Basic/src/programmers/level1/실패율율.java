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

public class 실패율율 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		int[] answer = new int[N];
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int s: stages) {
			map.put(s, map.getOrDefault(s, 0)+1); // 찾는 키가 있으면 키의 값 반환 없으면 기본값 반환
			// {1=1, 2=3, 3=2, 4=1, 6=1}
		}
		
		int total = stages.length;
		Node[] nodes = new Node[N];
		
		for(int i=1; i<=N; i++) {
			if(!map.containsKey(i)) { //containsKey 해당 map에 키가 있는지 없는지 boolean 타입으로 리턴
				nodes[i-1] = new Node(i,0); // 없으면 0넣어주기
				continue;
			}
			int cnt = map.get(i);
			nodes[i-1] = new Node(i, (double)cnt/total); // 실패율 계산해서 넣기
			total -= cnt;
		}
		Arrays.sort(nodes); // 정리 (rate 오름차순)
		
		// nodes에 있는 값 answer에 넣어주기 
		for(int i=0; i<N; i++) {
			answer[i] = nodes[i].stage;
		}
		
		// 답 출력
		for(int ans: answer) {
			System.out.print(ans+" ");
		}
	}

}
