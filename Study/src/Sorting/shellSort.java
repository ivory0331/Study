package Sorting;

import java.util.Scanner;

public class shellSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿ä¼ö ¼ö : ");
		int n = sc.nextInt();
		int sort_s[] = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("sort_s["+i+"] : ");
			sort_s[i] = sc.nextInt();
		}
		
		shell_Sort(n, sort_s);
		
		for(int ans: sort_s) {
			System.out.print(ans+" ");
		}
		sc.close();
	}


	static void shell_Sort(int n, int[] a) {
		for(int i=n/2; i>0; i/=2) {
			for(int j=i; j<n; j++) {
				int k;
				int temp = a[j];
				for(k=j-i; k>=0&&a[k]>temp; k-=i)
					a[k+i] = a[k];
				a[k+i] = temp;
			}
		}
		
	}

}
