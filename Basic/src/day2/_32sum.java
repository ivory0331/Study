package day2;

import java.util.Scanner;

public class _32sum { // �Էµ� �� �������� ���� ���ϱ�

	public static int sum(int a, int b) {
		
		// Ż������
		if(a==b) {
			return a;
		}
		
		return a + sum(a+1,b); //12
		
	}
	
	public static void main(String[] args) {
		int a; //1
		int b; //4
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �� : ");
		a = scan.nextInt();
		System.out.print("���� �� : ");
		b = scan.nextInt();
		
		System.out.println("�հ� : "+sum(a,b));
	}

}
