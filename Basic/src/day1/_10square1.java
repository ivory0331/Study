package day1;

public class _10square1 { // ���� �簢��1

	public static void main(String[] args) {
		
		int n = 5;
		
		/*
			n = 3
			1 2 3 
			4 5 6 
			7 8 9
		 */
		
		int num = 1;
		for(int i=0; i<n; i++) { // �� row
			
			for(int j=0; j<n; j++) { // �� col
				System.out.print(num+"  ");
				// System.out.printf("%4d",num); //������ �� �� ����
				num++;
			}
			System.out.println();
		}

	}

}
