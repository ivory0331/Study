package day4;

import java.util.Scanner;

public class _2798 { // ���� 2798�� - ����

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // ������ ī������ -> 5
		int m = scan.nextInt(); // m�� ����� �� ã�� -> 21
		int card[] = new int[n]; // ī�� �迭
		
		for(int i=0; i<n; i++) { // ī�� �ֱ�
			card[i] = scan.nextInt(); // 5 6 7 8 9
		}
		
		scan.close();
		
		int result = 0;
		int sum = 0;
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					sum = card[i]+card[j]+card[k]; //5 6 7 / 5 6 8 / 5 6 9 / 5 7 8 / 5 7 9 ...
					
					if(m>=sum && sum>result) { // m���� ���ų� ���� ���߿��� ���� ū ��
						result = sum;
					}
				}
				
			}
		}
		
		System.out.println(result);

	}

}
