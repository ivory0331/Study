package day3;

import java.util.Arrays;
import java.util.Scanner;

public class _10818 { // ���� 10818�� - �ּ�, �ִ�

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr); // �迭�� �ִ� ���� ������������ ����
		System.out.println(arr[0]+" "+arr[n-1]);
	}

}
