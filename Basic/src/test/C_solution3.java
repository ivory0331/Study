package test;

import java.util.*;

public class C_solution3 {

	public static void main(String[] args) {
		int k = 2;
		int[] score = {1300000000,700000000,668239490,618239490,568239490,568239486,518239486,157658638,157658634,100000000,100};
		int answer = -1;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<score.length-1; i++) {
			int key = score[i]-score[i+1];
			
			if(map.containsKey(key)) map.put(key, map.get(key)+1);
			else map.put(key, 1);
			
		}
		int cnt=0;
		Collection<Integer> values = map.values();
		for(int v : values) {
			if(v>=k) cnt += v;
		}
		
		answer += score.length - cnt-1;
		System.out.println(answer);
	}

}
