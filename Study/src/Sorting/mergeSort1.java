package Sorting;

import java.util.Scanner;

public class mergeSort1 {

	static int[] temp; // 임시
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요수 수 : ");
		int n = sc.nextInt();
		int sort_q[] = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("sort_s["+i+"] : ");
			sort_q[i] = sc.nextInt();
		}
		
		merge_Sort(sort_q, n);
		
		for(int ans: sort_q) {
			System.out.print(ans+" ");
		}
		sc.close();

	}

	static void merge_Sort(int[] a, int n) {
		temp = new int[n];
		
		mergeSort(a, 0, n-1);
		
		temp = null;
	}

	static void mergeSort(int[] a, int left, int right) {
		if(left<right) {
			int i;
			int center = (right+left)/2;
			int p=0;
			int j=0;
			int k=left;
			
			mergeSort(a, left, center);
			mergeSort(a, center+1, right);
			
			for(i=left; i<=center; i++)
				temp[p++] = a[i];
			while(i<=right && j<p)
				a[k++] = (temp[j]<=a[i]) ? temp[j++] : a[i++];
			while (j<p)
				a[k++] = temp[j++];
		}
	}

}
