package day5;

import java.util.Scanner;

public class _7568 { // ���� 7568�� - ��ġ

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // ��� �� 
		int arr[][] = new int[n][3]; // �����Կ� Ű �ֱ�
		int cnt = 0; // ��� ī��Ʈ 
		
		for(int i=0; i<n; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i<arr.length; i++) {
			cnt = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) { // �������� �� ū�Ϳ�
					cnt++; // ī��Ʈ
				}
			}
			arr[i][2] = cnt+1; // ����� ������ 1���� �����ϴϱ�
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i][2]+" ");
		}
	}

}
