package day3;

import java.util.Scanner;

public class _4344 { // ���� 4344�� - ����� �Ѱ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt(); // �����
		int cnt, sum, n;
		double result;
		
		for(int i=0; i<c; i++) {
			sum = 0; n = 0; cnt = 0; // �Ź� �ʱ�ȭ
			
			cnt = scan.nextInt();
			int arr[] = new int[cnt]; // 5
			
			for(int j=0; j<cnt; j++) { // ���� �� ��
				arr[j] = scan.nextInt(); // 50 50 70 80 100
				sum += arr[j];
			}
			for(int j=0; j<cnt; j++) { // ��� �̻� �л� �� 
				if(arr[j]>(double)sum/cnt) {
					n++;
				}
			}
			result = (double)n/cnt*100;
			
			System.out.println(Math.round(result*1000)/1000.0+"%");
			
		}
		scan.close();
	}
}
