package day3;

import java.util.Scanner;

public class _2577 { // 백준 2577번 - 숫자의 개수

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int arr[] = new int[10]; // 카운트 해줄 것
		
		String result = String.valueOf(A*B*C); // 곱셈결과 담기
		
		for(int i=0; i<result.length(); i++) {
			arr[result.charAt(i)-'0']++;
		}
		for(int i=0; i<arr.length; i++) { // 결과출력
			System.out.println(arr[i]);
		}
		
	}

}
