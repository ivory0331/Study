package studygroup;

import java.util.*;

public class _11000 { // 강의실 배정
	static class lec {
		int s, e;
		lec(int s, int e){
			this.s = s; 
			this.e = e;
		}
		
		static Comparator<lec> comparator = new Comparator<lec>() {	
			@Override
			public int compare(lec o1, lec o2) {
				if(o1.s==o2.s) return Integer.compare(o1.e, o2.e);
				else return Integer.compare(o1.s, o2.s);
			}
		};
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		lec[] arr = new lec[N];
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i=0; i<N; i++) {
			arr[i] = new lec(scan.nextInt(),scan.nextInt());
		}
		scan.close();
		
		Arrays.sort(arr, lec.comparator);
		
		pq.add(arr[0].e);
		for(int i=1; i<N; i++) {
			if(pq.peek()<=arr[i].s) pq.poll();
			pq.add(arr[i].e);
		}
		System.out.println(pq.size());
	}

}
