package day3;

import java.util.Scanner;

public class _2577 { // ���� 2577�� - ������ ����

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int arr[] = new int[10]; // ī��Ʈ ���� ��
		
		String result = String.valueOf(A*B*C); // ������� ���
		
		for(int i=0; i<result.length(); i++) {
			arr[result.charAt(i)-'0']++;
		}
		for(int i=0; i<arr.length; i++) { // ������
			System.out.println(arr[i]);
		}
		
	}

}
