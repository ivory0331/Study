package day3;

import java.util.Scanner;

public class _5543 { // 백준 5543번 - 상근날드

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int burger = 2000;
		int drink = 2000;
		
		// 버거 가격
		for(int i=0; i<3; i++) {
			int cost = scan.nextInt();
			if(burger>=cost) {
				burger = cost;
			}
		}

		// 음료 가격
		for(int i=0; i<2; i++) {
			int cost = scan.nextInt();
			if(drink>=cost) {
				drink = cost;
			}
				
		}
		System.out.println(burger+drink-50);
		
	}

}
