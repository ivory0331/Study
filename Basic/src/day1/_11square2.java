package day1;

public class _11square2 { // 숫자 사각형2

	public static void main(String[] args) {
		
		int n = 4;
		
	/*
		n = 3
		1 2 3 
		6 5 4 
		7 8 9
	*/
		
		int arr[][] = new int[n][n];
		
		// ===== 값을 넣어주는 부분 =====
		for(int i=0; i<n; i++) {
			
			if(i%2 == 0) { //짝수 행일경우
				for(int j=0; j<n; j++) { // 열 col
					arr[i][j] = i * n + j + 1;
				}
			}
			else { // 홀수 행일경우
				for(int j=n-1; j>=0; j--) { // 열 col
					arr[i][j] = i * n + n - j;
				}
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
