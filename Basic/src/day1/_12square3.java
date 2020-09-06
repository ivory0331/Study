package day1;

public class _12square3 { // 숫자 사각형3

	public static void main(String[] args) {
		
		int n = 4;
		int arr[][] = new int[n][n];
	/*
		n = 3
		1 4 7 
		2 5 8 
		3 6 9
	*/
		
		// ===== 값을 넣어주는 부분 =====
		int num = 1;
		for(int i = 0; i<n; i++) {
			
			for(int j=0; j<n; j++) { 
				arr[j][i] = num;
				num++;
				//arr[j][i] = i*n + j + 1;
			}
		}
		
		
		// ===== 출력부분 =====
		for(int i=0; i<n; i++) { // 행 row
			
			for(int j=0; j<n; j++) { // 열 col
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
