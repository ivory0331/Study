package day3;

import java.util.Scanner;

public class _5543 { // ���� 5543�� - ��ٳ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int burger = 2000;
		int drink = 2000;
		
		// ���� ����
		for(int i=0; i<3; i++) {
			int cost = scan.nextInt();
			if(burger>=cost) {
				burger = cost;
			}
		}

		// ���� ����
		for(int i=0; i<2; i++) {
			int cost = scan.nextInt();
			if(drink>=cost) {
				drink = cost;
			}
				
		}
		System.out.println(burger+drink-50);
		
	}

}
