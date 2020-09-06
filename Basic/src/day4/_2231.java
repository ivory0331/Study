package day4;

import java.util.Scanner;

public class _2231 { // 백준 2231번 - 분해합
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //216
		int sum = 0;
		scan.close();
		
		for(int i=1; i<=n; i++) {
			sum = sum(i);
			if(i+sum == n) { // 198+(1+9+8) == 216
				sum = i; // sum = 198
				break;
			}
		}
		if(n>10) {
			System.out.println(sum);
		}
		else {
			System.out.println(0);
		}
	}
	
	public static int sum(int i) {
		int res = 0;
		
		while(i>0) { // (1+9+8)
			res += i%10;
			i/=10;
		}
		return res;
	}

}
