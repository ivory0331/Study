package day1;

public class _11square2 { // ���� �簢��2

	public static void main(String[] args) {
		
		int n = 4;
		
	/*
		n = 3
		1 2 3 
		6 5 4 
		7 8 9
	*/
		
		int arr[][] = new int[n][n];
		
		// ===== ���� �־��ִ� �κ� =====
		for(int i=0; i<n; i++) {
			
			if(i%2 == 0) { //¦�� ���ϰ��
				for(int j=0; j<n; j++) { // �� col
					arr[i][j] = i * n + j + 1;
				}
			}
			else { // Ȧ�� ���ϰ��
				for(int j=n-1; j>=0; j--) { // �� col
					arr[i][j] = i * n + n - j;
				}
			}
			
		}
		
		// ===== ��ºκ� =====
		for(int i=0; i<n; i++) { // �� row
			
			for(int j=0; j<n; j++) { // �� col
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
