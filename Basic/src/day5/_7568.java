package day5;

import java.util.Scanner;

public class _7568 { // 백준 7568번 - 덩치

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 사람 수 
		int arr[][] = new int[n][3]; // 몸무게와 키 넣기
		int cnt = 0; // 등수 카운트 
		
		for(int i=0; i<n; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i<arr.length; i++) {
			cnt = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) { // 비교했을때 더 큰것에
					cnt++; // 카운트
				}
			}
			arr[i][2] = cnt+1; // 등수는 무조건 1부터 시작하니까
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i][2]+" ");
		}
	}

}
