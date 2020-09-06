package day4;

import java.util.Scanner;

public class _1065 { // ���� 1065�� - �Ѽ�

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if(n<100) { // ���ڸ��� �̸��� ���
			System.out.println(n); // ���ڸ� ���� ��� �Ѽ��� �� �� �ִ�.
		}
		else { // ���ڸ��� �̻��� ���
			int result = 99;
			for(int i=100; i<=n; i++) {
				result += hansu(i);
			}
			System.out.println(result);
		}
		scan.close();
	}
	public static int hansu(int n) {
		int cnt = 0;
		int hun = n/100; // �����ڸ�
		int ten = (n/10)%10; // �����ڸ�
		int one = n%10; // �����ڸ�
		
		if((hun-ten) == (ten-one)) {
			cnt++;
		}
		
		return cnt;
	}

}
