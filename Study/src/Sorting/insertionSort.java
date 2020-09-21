package Sorting;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿ä¼ö ¼ö : ");
		int n = sc.nextInt();
		int sort_s[] = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("sort_s["+i+"] : ");
			sort_s[i] = sc.nextInt();
		}
		
		insertionSort(n, sort_s);
		
		for(int ans: sort_s) {
			System.out.print(ans+" ");
		}

	}

	static void insertionSort(int n, int[] a) {
		for(int i=1; i<n; i++) {
			int temp = a[i];
			int j;
			for(j=i; j>0&&a[j-1]>temp; j--)
				a[j] = a[j-1];
			a[j] = temp;
		}
		
	}

}
