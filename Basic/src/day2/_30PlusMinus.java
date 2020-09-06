package day2;

import java.util.Scanner;

public class _30PlusMinus { // 입력된 숫자까지 +와 -를 반복하기

	public static void main(String[] args) {
		
		int n;
		boolean flag = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			if(i == n) {
				System.out.print(i);
				break;
			}
			
			if(flag) {
				System.out.print(i+"+");
				flag = false;
			}
			else {
				System.out.print(i+"-");
				flag = true;
			}
		}

	}

}
