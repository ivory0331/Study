package day1;

import java.util.Scanner;

public class _03최빈수 { //최빈수 구하기

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int []inputNum = new int[10]; // 크기가 10인 배열 생성
		
		for(int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		// 사용자 input
		
		// 1 2 2 3 1 4 2 2 4 3
		
		// 1: 2
		// 2: 4 --> 최빈수
		// 3: 2
		// 4: 2
		
		int []mode = new int [10];
		
		// index -> 출현한 수
		// index 값 -> index(출현한수)가 몇번 나왔는지 저장하는 용도
		
		//"mode[3] = 5, => 3번 숫자가, 5번 출현했다" 
		
		// inputNum => 1 2 2 3 1 4 2 2 4 3
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++;
		}
		// mode[1] == 2
		// mode[2] == 4
		// mode[3] == 2
		// mode[4] == 2
		
		int modeNum = 0; // 최빈수
		int modeCnt = 0; // 최빈수가 나온 횟수
		for(int i=0; i<10; i++) {
			if(modeCnt < mode[i]) { // 최빈수가 나왔을때만 작동하도록 조건을 줌
				modeCnt = mode[i];
				modeNum = i;
			}
		}

		System.out.println("최빈수는: "+modeNum+" cnt: "+modeCnt);
	}

}
