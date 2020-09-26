package Sorting;

import java.util.Scanner;

public class quickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : ");
		int n = sc.nextInt();
		int sort_q[] = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("sort_s["+i+"] : ");
			sort_q[i] = sc.nextInt();
		}
		
		quick_Sort(sort_q, 0, n-1);
		
		for(int ans: sort_q) {
			System.out.print(ans+" ");
		}
		sc.close();

	}


	static void quick_Sort(int[] a, int L, int R) {
		int pl=L; // ���� ������
		int pr=R; // ������ ������
		int x = a[(pl+pr)/2]; // �ǹ�(����)
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--); // swap �Ŀ� Ŀ�� �̵�
		} while (pl<=pr);
		
		if(L<pr) quick_Sort(a, L, pr);
		if(R>pl) quick_Sort(a, pl, R);
	}

	static void swap(int[] a, int pl, int pr) {
		int temp = a[pr];
		a[pr] = a[pl];
		a[pl] = temp;
	}

}
