package day3;

import java.util.Scanner;

public class _2446 { // ���� 2446�� - �����9

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 5
		
		// ���ﰢ��
		for(int i=0; i<n; i++) { // 5�� �ݺ�
			
			// ����
			for(int j=0; j<i; j++) { // 0 1 2 3 
				System.out.print(" ");
			}
			
			// ��
			for(int s=0; s<(2*n-1)-(2*i); s++) { //9 7 5 3 1
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		// �ﰢ��
		for(int i=0; i<n-1; i++) { // 4�� �ݺ�
			
			// ����
			for(int j=0; j<(n-2)-i; j++) { // 3 2 1
				System.out.print(" ");
			}
			
			// ��
			for(int s=0; s<3+(i*2); s++) { // 3 5 7 9
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
