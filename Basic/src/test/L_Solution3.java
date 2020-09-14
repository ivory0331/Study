package test;

import java.util.*;

public class L_Solution3 {

	public static void main(String[] args) {
		int[] ball = {1,2,3,4,5,6};
		int[] order = {6,2,5,1,4,3};
		
		int[] answer = {};
		Deque<Integer> d = new LinkedList();
		
		for(int i=0; i<ball.length; i++) {
			d.offerLast(ball[i]);
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		do {
			int Ans = checkk(ball, d, order);
			result.add(Ans);
			
		} while (!d.isEmpty());
		
	}

	public static int checkk(int[] ball, Deque<Integer> d, int[] order) {
		ArrayList<Integer> rest = new ArrayList<>();
		for(int i=0; i<order.length; i++) {// 6 2 5
			if(order[i]==d.peekFirst()) {
				rest.add(-1);
				int R = d.pollFirst();
				String r = checkk2(ball, d, rest);
				
				if("F".equals(r)) {
					
				} else if("L".equals(r)) {
				
				} else {
					return R; // °ø »©±â
				}
				
			}else if(order[i]==d.peekLast()) {
				rest.add(-1);
				int R = d.pollFirst();
				
				for(int k=0; k<rest.size(); k++) {
					if(rest.get(k)!=-1) {
						String r = checkk2(ball, d, rest);
					}else {// ´Ù »°À¸¸é ±×³É °ø »©±â ¸®ÅÏ
						return R; // °ø »©±â
					}
				}
			}else {
				rest.add(order[i]);
			}
		}
		return 0;
	}

	public static String checkk2(int[] ball, Deque<Integer> d, ArrayList<Integer> rest) {
		for(int i=0; i<rest.size(); i++) {
			if(rest.get(i)==d.peekFirst()) {
				rest.remove(i);
				return "F";
			}else if(rest.get(i)==d.peekLast()) {
				rest.remove(i);
				return "L";
			}
		}
		return null;
	}

}
