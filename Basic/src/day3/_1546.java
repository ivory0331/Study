package day3;

import java.util.Scanner;

public class _1546 { // 백준 1546문제 - 평균

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0;
		double best = 0;
		double score[] = new double[n];
		
		for(int i=0; i<n; i++) { // 최고점수 구하기
			score[i] = scan.nextInt();
			
			if(best < score[i]) {
				best = score[i];
			}
		}
		scan.close();
		
		for(int i=0; i<n; i++) {
			score[i] = score[i]/best*100; // 새로운 점수 구하기
			sum += score[i]; // 합계 구하기
		}
		
		System.out.println(sum/n);
	}

}
