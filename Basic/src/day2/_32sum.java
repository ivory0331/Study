package day2;

import java.util.Scanner;

public class _32sum { // 입력된 두 수까지의 합을 구하기

	public static int sum(int a, int b) {
		
		// 탈출조건
		if(a==b) {
			return a;
		}
		
		return a + sum(a+1,b); //12
		
	}
	
	public static void main(String[] args) {
		int a; //1
		int b; //4
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작할 수 : ");
		a = scan.nextInt();
		System.out.print("끝낼 수 : ");
		b = scan.nextInt();
		
		System.out.println("합계 : "+sum(a,b));
	}

}
