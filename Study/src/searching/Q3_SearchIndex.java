package searching;

import java.util.*;

public class Q3_SearchIndex {

	public static void main(String[] args) {
		int[] a = {1,9,2,9,4,6,7,9};
		int n = 8;
		int key = 9;
		
		ArrayList<Integer> idx = new ArrayList<>();
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx.add(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
		

	}

}
