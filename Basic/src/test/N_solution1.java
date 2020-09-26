package test;

import java.util.HashMap;

public class N_solution1 {

	public static void main(String[] args) {
		int[][] flowers = {{3,4},{4,5},{6,7},{8,10}};
		int answer = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<flowers.length; i++) {
			int start = flowers[i][0];
			int end = flowers[i][1]-1;
			
			
			for(int j=start; j<=end; j++) {
				map.put(j, 1);
			}
		}
		answer = map.size();
		System.out.println(answer);
	}

}
