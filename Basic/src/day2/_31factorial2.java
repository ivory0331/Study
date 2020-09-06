package day2;

import java.util.Scanner;

public class _31factorial2 { // 재귀함수를 이용한 팩토리얼 문제 풀기

	// 재귀함수는 탈출조건을 반드시 써야 한다.
	
	public static int calFact(int i) {
		
		if(i == 1) {
			return 1; // 탈출조건!
		}
		
		return i * calFact(i-1);
		
	}
	
	
	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		input = scan.nextInt();
		int answer = 0;
		
		answer = calFact(input);
		
		System.out.println(answer);
	}

}
