package day3;

import java.util.Scanner;

public class _4344 { // 백준 4344번 - 평균은 넘겠지

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt(); // 시험수
		int cnt, sum, n;
		double result;
		
		for(int i=0; i<c; i++) {
			sum = 0; n = 0; cnt = 0; // 매번 초기화
			
			cnt = scan.nextInt();
			int arr[] = new int[cnt]; // 5
			
			for(int j=0; j<cnt; j++) { // 성적 총 합
				arr[j] = scan.nextInt(); // 50 50 70 80 100
				sum += arr[j];
			}
			for(int j=0; j<cnt; j++) { // 평균 이상 학생 수 
				if(arr[j]>(double)sum/cnt) {
					n++;
				}
			}
			result = (double)n/cnt*100;
			
			System.out.println(Math.round(result*1000)/1000.0+"%");
			
		}
		scan.close();
	}
}
