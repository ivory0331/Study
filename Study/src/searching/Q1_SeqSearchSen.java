package searching;

import java.util.Scanner;

public class Q1_SeqSearchSen { // 115p - Q1

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = scan.nextInt();
		
		// 데이터 넣어주기
		int[] x = new int[num+1];
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		
		scan.close();
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key+"은(는) x["+idx+"] 에 있습니다.");
		}

	}

	private static int seqSearchSen(int[] x, int num, int key) {
		
		int a = -1;
		for(int i=0; i<num; i++) {
			if(x[i]==key) {
				a = i;
			} 
		}
		return a;
	}

}
