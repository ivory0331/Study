package day5;

import java.util.*;

public class _6603 { // ��Ʈ��ŷ

	static int n;
	static int[] arr;
	static boolean[] result;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //7
		
		while(n!=0) {
			arr = new int[n];
			result = new boolean[n];
			
			for(int i=0; i<n; i++) { // n����ŭ �ݺ�
				arr[i] = sc.nextInt();
			}
			
			DFS(0,0);
			System.out.println();
		}
		sc.close();
	}

	static void DFS(int start, int depth) {
		if(depth==6) { // �� �˻��ߴٸ�
			for(int i=0; i<n; i++) {
				if(result[i]) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
		}
		for(int i=start; i<n; i++) {
			result[i] = true;
			System.out.println(">>"+i+", "+depth);
			DFS(i+1, depth+1);
			result[i] = false;
		}
	}
}
