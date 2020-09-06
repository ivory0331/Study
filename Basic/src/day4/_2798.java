package day4;

import java.util.Scanner;

public class _2798 { // 백준 2798번 - 블랙잭

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 몇장의 카드인지 -> 5
		int m = scan.nextInt(); // m과 비슷한 합 찾기 -> 21
		int card[] = new int[n]; // 카드 배열
		
		for(int i=0; i<n; i++) { // 카드 넣기
			card[i] = scan.nextInt(); // 5 6 7 8 9
		}
		
		scan.close();
		
		int result = 0;
		int sum = 0;
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					sum = card[i]+card[j]+card[k]; //5 6 7 / 5 6 8 / 5 6 9 / 5 7 8 / 5 7 9 ...
					
					if(m>=sum && sum>result) { // m보다 같거나 작은 것중에서 가장 큰 수
						result = sum;
					}
				}
				
			}
		}
		
		System.out.println(result);

	}

}
