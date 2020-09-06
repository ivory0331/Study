package day3;

import java.util.Scanner;

public class _10039 { // 백준 10039번 - 평균점수

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int Gnum = 0;
		for(int i=0; i<5; i++) {
			Gnum = scan.nextInt();
			
			if(Gnum <= 40) {
				Gnum = 40;
			}
			sum += Gnum;
		}
		System.out.println(sum/5);
		
	}

}
