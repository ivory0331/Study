package day3;

import java.util.Scanner;

public class _3052 { // ���� 3052�� - ������

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[10];
		int res[] = new int[42];
		
		for(int i=0; i<arr.length; i++) { // �迭�� ���� �ֱ�
			arr[i] = scan.nextInt();
			// 39 40 41 42 43 44 82 83 84 85
		}
		scan.close();
		
		for(int i=0; i<arr.length; i++) { // ������ ���ϱ�
			res[arr[i]%42]++;
			// 39, 40, 41, 0, 1, 2, 40, 41, 0, 1
		}
		
		int cnt = 0;
		for(int i=0; i<res.length; i++) { // �ߺ��� �ƴ� ���� ���� ���ϱ�
			if(res[i] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt); // 6
	}

}
