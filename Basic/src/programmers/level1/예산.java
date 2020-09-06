package programmers.level1;

import java.util.*;

public class ¿¹»ê {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		int answer = 0;
		Arrays.sort(d); //1 2 3 4 5
		for(int i=0; i<d.length; i++) {
			if(d[i]<=budget) {
				answer++; // 1 2 3 
				budget -= d[i]; // budget=8 6 3 
			}else {
				break;
			}
		}
        System.out.println(answer);

	}

}
