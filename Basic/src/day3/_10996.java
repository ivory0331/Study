package day3;

import java.util.Scanner;

public class _10996 { // ���� 10996�� - ����� 21

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n*2; i++) { // ������� 2*n��
			
			if(i%2==0) { //¦��
				for(int j=1; j<=n; j++) {
					if(j%2==0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				
			}else { //Ȧ��
				for(int j=1; j<=n; j++) {
					if(j%2==0) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				
			}
			System.out.println("");
		}

	}

}
