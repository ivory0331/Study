package test;

import java.util.ArrayList;

public class solution7 {

	public static void main(String[] args) {
		int[] sales = {14, 17, 15, 18, 19, 14, 13, 16, 28, 17};
		int[][] links = {{10, 8}, {1, 9}, {9, 7},
						 {5, 4}, {1, 5}, {5, 10},
						 {10, 6}, {1, 3}, {10, 2}};
		int answer = 0;
		
		int[][] work = new int[sales.length][2];

		// 앞엔 사원번호 뒤는 가치
		for(int i=0; i<work.length; i++) {
			work[i][0]=i+1;
			work[i][1]=sales[i];
		}
		
		ArrayList<Integer> teamM = new ArrayList<>();
		boolean flag = false;
		// 팀장 골라내기. 팀 분류
		for(int i=0; i<links.length; i++) {
			if(teamM.size()==0) { // 비어있다면
				teamM.add(links[i][0]);
				continue;
			} else {// 뭔가 있다면
				for(int k=0; k<teamM.size(); k++) { // 같은것이 있는지 검사
					if(teamM.get(k)!=links[i][0]) flag=false;
					else{ flag=true; break;}
				}
				if(!flag) teamM.add(links[i][0]);
			}
		}// teamM= 1 5 9 10
		
		
		
		
		//System.out.println(answer);
	}

}
