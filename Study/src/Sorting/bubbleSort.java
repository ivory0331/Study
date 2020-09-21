package Sorting;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿ä¼ö ¼ö : ");
		int n = sc.nextInt();
		int sort_b[] = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("sort_b["+i+"] : ");
			sort_b[i] = sc.nextInt();
		}
		
		bubbleSort(n, sort_b);
		
		for(int ans: sort_b) {
			System.out.print(ans+" ");
		}
	}

	static void bubbleSort(int n, int[] a) {
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(a[j]>a[j+1])
					swap(a, j, j+1);
			}
		}
		
	}

	static void swap(int[] a, int j, int i) {
		int t = a[j];
		a[j] = a[i];
		a[i] = t;
	}

}
