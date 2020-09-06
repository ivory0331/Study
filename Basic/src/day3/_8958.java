package day3;

import java.util.Scanner;

public class _8958 { // 백준 8958번 - OX퀴즈

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str[] = new String[n+1];
		
		
		for(int i=0; i<n; i++) { // 5줄 보여줄 예정
			int cnt = 0;
			int sum = 0;
			str[i] = scan.next();
			
			for(int j=0; j<str[i].length(); j++) { // 하나하나 비교
				if(str[i].charAt(j)=='O') {
					sum += ++cnt;
				}else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
		scan.close();
		
	}

}
