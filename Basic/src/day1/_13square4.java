package day1;

public class _13square4 { // 숫자 사각형4

	public static void main(String[] args) {
		
		int n = 4;
		int arr[][] = new int[n][n];
	/*
		n = 4
		1  2  3  4    [0,0] [0,1] [0,2] [0,3]
		2  4  6  8    [1,0] [1,1] [1,2] [1,3]
		3  6  9  12   [2,0] [2,1] [2,2] [2,3]
		4  8  12 16   [3,0] [3,1] [3,2] [3,3]
	*/

		// ===== 값을 넣어주는 부분 =====
		int num = 1;
		for(int i=1; i<n+1; i++) {
			
			for(int j=0; j<n; j++) {
				arr[i-1][j] = num; // [0,0] = 1 [0,1] = 2
				num += i; // num = 1+1 2+1 3+1
			}
			num = i+1;
		} // 와 풀었어ㅜㅜ 나 천재ㅜㅜ
		
		
		// ===== 출력부분 =====
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
