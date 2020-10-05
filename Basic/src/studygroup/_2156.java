package studygroup;

import java.util.*;

public class _2156 { // 다이나믹 프로그래밍

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 포도주 잔 개수
		int[] grape = new int[n]; // 6
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			grape[i] = scan.nextInt(); // 6,10,13,9,8,1
		}
		
		int[] sumG = new int[n];
		sumG[0] = grape[0];
		
		if(n>2) {
			
			sumG[1] = grape[0]+grape[1];
			sumG[2] = Math.max(sumG[1], Math.max(grape[0]+grape[2], grape[1]+grape[2]));
			
			for(int j=3; j<sumG.length; j++) {
				sumG[j] = Math.max(grape[j]+sumG[j-2], grape[j]+grape[j-1]+sumG[j-3]);
				sumG[j] = Math.max(sumG[j], sumG[j-1]);
			}
			answer += sumG[n-1];
		} else if(n==2)
			answer = grape[0]+grape[1];
		else if(n==1)
			answer = grape[0];
		
		System.out.println(answer);
	}
}
