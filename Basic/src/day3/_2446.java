package day3;

import java.util.Scanner;

public class _2446 { // 백준 2446번 - 별찍기9

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 5
		
		// 역삼각형
		for(int i=0; i<n; i++) { // 5번 반복
			
			// 공백
			for(int j=0; j<i; j++) { // 0 1 2 3 
				System.out.print(" ");
			}
			
			// 별
			for(int s=0; s<(2*n-1)-(2*i); s++) { //9 7 5 3 1
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		// 삼각형
		for(int i=0; i<n-1; i++) { // 4번 반복
			
			// 공백
			for(int j=0; j<(n-2)-i; j++) { // 3 2 1
				System.out.print(" ");
			}
			
			// 별
			for(int s=0; s<3+(i*2); s++) { // 3 5 7 9
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
