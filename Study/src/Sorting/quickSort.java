package Sorting;

import java.util.Scanner;

public class quickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요수 수 : ");
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
		int pl=L; // 왼쪽 포인터
		int pr=R; // 오른쪽 포인터
		int x = a[(pl+pr)/2]; // 피벗(기준)
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--); // swap 후에 커서 이동
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
