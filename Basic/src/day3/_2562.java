package day3;

import java.util.Scanner;

public class _2562 { // ���� 2562�� - �ִ�

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[9];
		
		for(int i=0; i<arr.length; i++) { // �迭�� �־��ֱ�
			arr[i] = scan.nextInt();
		}
		
		int tmp = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(tmp < arr[i]) {
				tmp = arr[i];
			}
		}
		System.out.println(tmp);
		for(int i=0; i<arr.length; i++) {
			if(tmp == arr[i]) {
				System.out.println(i+1);
			}
		}

	}

}
