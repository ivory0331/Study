package day5;

import java.util.Scanner;

public class _1018 { // ���� 1018�� - ü���� �ٽ� ĥ�ϱ�

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt(); //8
		int n = scan.nextInt(); //8
		char arr[][] = new char[m][n];
		
		// �迭�� �Է°� �ֱ�
		for(int i=0; i<m; i++) {
			String str = scan.next(); //WBWBWBWB
			for(int j=0; j<n; j++) {
				arr[i][j] = str.charAt(j); // ���� �ϳ��ϳ� ����
			}
		}
		
		int cnt = 0;
		int result = 999;
		// 8*8 �������� ü���� �����
		for(int i=0; i<n-8; i++) {
			for(int j=0; j<m-8; j++) {
				
				for(int x=0; x<8; x++) {
					for(int y=0; y<8; y++) {
						if((x+y)%2==0) { // ¦���� ��� B
							if(arr[x+i][y+j] != 'B') // �ٵ� �ƴ϶�� ī��Ʈ
								cnt++;
						}
						else { // Ȧ���� ��� W
							if(arr[x+i][y+j] != 'W') 
								cnt++;
						}
					}
					result = Math.min(Math.min(64-cnt, cnt),result);
					cnt = 0;
				}
			}
		}
		System.out.println(result);
	}

}
