package searching;

import java.util.Scanner;

public class BinSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소의 개수 : "); // 11
		int n = scan.nextInt();
		
		System.out.print("검색할 값 : "); // 7
		int key = scan.nextInt();
		
		int[] a = new int[n];
		System.out.println("값 넣기"); // 1 3 5 7 7 7 7 7 8 8 9 9
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		int answer = binSearchX(a, n, key);
		
		if(answer == -1 ) {
			System.out.println("못찾았음");
		}else {
			System.out.println(answer+"에 있음");
		}
	}

	private static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			
			if (a[pc] == key) {
				for (; pc > pl; pc--) { // 중앙index보다 작으면 계속ㄱㄱ
					if (a[pc - 1] < key)
						break;
				}
				return pc; // 검색성공
			}
			else if (a[pc] < key)
				pl = pc + 1; // 검색범위를 앞쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 뒤쪽 절반으로 좁힘
			
		} while (pl <= pr);
		
		return -1;
	}

}
