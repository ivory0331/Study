package day3;

import java.util.Scanner;

public class _10817 { // ���� 10817�� - �� �� 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[3];
		int tmp = 0;
		
		for(int i=0; i<arr.length; i++) { // ���� ���� �迭�� �־��ֱ�
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) { // arr[0] = 10 / arr[1] = 20 / arr[2] = 30
			for(int j=0; j<arr.length; j++) { 
				if(arr[i] > arr[j]) {  // 20 > 10 / 30 > 20 / 20 > 10
					tmp = arr[i]; // tmp = 20 / tmp = 30 / tmp = 20
					arr[i] = arr[j]; // arr[1] = 10 / arr[2] = 20 / arr[2] = 10
					arr[j] = tmp;  // arr[0] = 20 -> 20�� 10�� �ڸ� �ű� / arr[0] = 30 / arr[1] = 20
				}
			}
		}
		
		System.out.println(arr[1]);
	}

}
