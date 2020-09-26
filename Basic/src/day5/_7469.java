package day5;

import java.util.*;

public class _7469 { // K¹øÂ° ¼ö

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}

		for(int i=0; i<m; i++) {
			int start = scan.nextInt()-1;
			int end = scan.nextInt()-1;
			int goal = scan.nextInt()-1;
			int p = 0;
			int[] tmp = new int[end-start+1];
			for(int j=start; j<=end; j++) {
				tmp[p++] = a[j];
			}
			Arrays.sort(tmp);
			
			System.out.println(tmp[goal]);
			
		} 
	}

}
