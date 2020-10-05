package studygroup;

import java.util.Scanner;

public class _2839_2 {
//	https://godbell.tistory.com/26
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] dy = new int[N+1];
		int[] list = {-1,-1,-1,1,-1,1,2,-1};// 4와 7을 제외하고는 다 3과5로 나눌 수 있기 때문에
		
		if(N<=7)
			System.out.println(list[N]);
		else {
			for(int i=0; i<=7; i++)
				dy[i] = list[i];
		
		for(int i=8; i<=N; i++) {
			if(dy[i-5] != -1 && dy[i-3] != -1) {
				dy[i] = 1+Math.min(dy[i-3], dy[i-5]);
			}
			else if(dy[i-5] == -1 && dy[i-3] != -1)
				dy[i] = 1+dy[i-3];
			else if(dy[i-5] != -1 && dy[i-3] == -1)
				dy[i] = 1+dy[i-5];
			
			
		}
		System.out.println(dy[N]);
		}
	}

}
