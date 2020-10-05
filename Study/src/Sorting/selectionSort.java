package Sorting;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿ä¼ö ¼ö : ");
		int n = sc.nextInt();
		int sort_s[] = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("sort_s["+i+"] : ");
			sort_s[i] = sc.nextInt();
		}
		
		selectionSort(n, sort_s);
		
		sc.close();
		
		for(int ans: sort_s) {
			System.out.print(ans+" ");
		}
	}

	static void selectionSort(int n, int[] a) {
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(a[min]>a[j])
					min = j;
				swap(a, i, min);
			}
		}
		
	}

	static void swap(int[] a, int i, int min) {
		int s = a[min];
		a[min] = a[i];
		a[i] = s;
	}

}
