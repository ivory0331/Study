package day4;

import java.util.Scanner;

public class _1065 { // 백준 1065번 - 한수

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if(n<100) { // 세자리수 미만의 경우
			System.out.println(n); // 두자리 수는 모두 한수로 볼 수 있다.
		}
		else { // 세자리수 이상의 경우
			int result = 99;
			for(int i=100; i<=n; i++) {
				result += hansu(i);
			}
			System.out.println(result);
		}
		scan.close();
	}
	public static int hansu(int n) {
		int cnt = 0;
		int hun = n/100; // 백의자리
		int ten = (n/10)%10; // 십의자리
		int one = n%10; // 일의자리
		
		if((hun-ten) == (ten-one)) {
			cnt++;
		}
		
		return cnt;
	}

}
