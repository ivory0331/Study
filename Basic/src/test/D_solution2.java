package test;

import java.util.*;

public class D_solution2 {

	public static void main(String[] args) {
		int n = 100;
		int[][] groups = {{1, 50},{1,100},{51,100}};
		int answer = 0;
		
		HashMap<Integer, Integer> gmap = new HashMap<>();
		
		int all = 0;
		for(int i=1; i<=n; i++) {
			gmap.put(i, 0);
			
		}
		
		
		for(int i=0; i<groups.length; i++) {
			all = 0;
			for(int s=groups[i][0]; s<=groups[i][1]; s++) {
				gmap.put(s, 1);
				++all;
			}
			if(all==n) System.out.println("³¡");
		}

		
		int cnt=0;
		if(gmap.containsValue(0)) {
			for(int i=1; i<=gmap.size(); i++) {
				if(gmap.get(i)==0) cnt++;
			}
		}else {
			for(int i=1; i<=gmap.size(); i++) {
				if(gmap.get(i)==0) cnt++;
				if(gmap.get(i)==1) {
					
				}
			}
		}
		
		System.out.println(cnt);
	}

}
