package day3;

import java.util.Scanner;

public class _1546 { // ���� 1546���� - ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0;
		double best = 0;
		double score[] = new double[n];
		
		for(int i=0; i<n; i++) { // �ְ����� ���ϱ�
			score[i] = scan.nextInt();
			
			if(best < score[i]) {
				best = score[i];
			}
		}
		scan.close();
		
		for(int i=0; i<n; i++) {
			score[i] = score[i]/best*100; // ���ο� ���� ���ϱ�
			sum += score[i]; // �հ� ���ϱ�
		}
		
		System.out.println(sum/n);
	}

}
