package studygroup;

import java.util.Scanner;

public class _2839_2 {
//	https://godbell.tistory.com/26
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] dy = new int[N+1];
		int[] list = {-1,-1,-1,1,-1,1,2,-1};// 4�� 7�� �����ϰ�� �� 3��5�� ���� �� �ֱ� ������
		
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
