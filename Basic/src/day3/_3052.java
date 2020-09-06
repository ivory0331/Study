package day3;

import java.util.Scanner;

public class _3052 { // 백준 3052번 - 나머지

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[10];
		int res[] = new int[42];
		
		for(int i=0; i<arr.length; i++) { // 배열에 숫자 넣기
			arr[i] = scan.nextInt();
			// 39 40 41 42 43 44 82 83 84 85
		}
		scan.close();
		
		for(int i=0; i<arr.length; i++) { // 나머지 구하기
			res[arr[i]%42]++;
			// 39, 40, 41, 0, 1, 2, 40, 41, 0, 1
		}
		
		int cnt = 0;
		for(int i=0; i<res.length; i++) { // 중복이 아닌 수의 개수 구하기
			if(res[i] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt); // 6
	}

}
