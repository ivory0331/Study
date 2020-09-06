package day5;

import java.util.Scanner;

public class _1018 { // 백준 1018번 - 체스판 다시 칠하기

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt(); //8
		int n = scan.nextInt(); //8
		char arr[][] = new char[m][n];
		
		// 배열에 입력값 넣기
		for(int i=0; i<m; i++) {
			String str = scan.next(); //WBWBWBWB
			for(int j=0; j<n; j++) {
				arr[i][j] = str.charAt(j); // 문자 하나하나 저장
			}
		}
		
		int cnt = 0;
		int result = 999;
		// 8*8 기준으로 체스판 만들기
		for(int i=0; i<n-8; i++) {
			for(int j=0; j<m-8; j++) {
				
				for(int x=0; x<8; x++) {
					for(int y=0; y<8; y++) {
						if((x+y)%2==0) { // 짝수일 경우 B
							if(arr[x+i][y+j] != 'B') // 근데 아니라면 카운트
								cnt++;
						}
						else { // 홀수일 경우 W
							if(arr[x+i][y+j] != 'W') 
								cnt++;
						}
					}
					result = Math.min(Math.min(64-cnt, cnt),result);
					cnt = 0;
				}
			}
		}
		System.out.println(result);
	}

}
