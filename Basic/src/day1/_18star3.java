package day1;

public class _18star3 {

	public static void main(String[] args) {
		int n = 5;
		
		/*
		    *   [0,0] [0,1] [0,2] [0,3] /[0,4]
		   **   [1,0] [1,1] [1,2] /[1,3] [1,4]
		  ***   [2,0] [2,1] /[2,2] [2,3] [2,4]
		 ****   [3,0] /[3,1] [3,2] [3,3] [3,4]
		*****   /[4,0] [4,1] [4,2] [4,3] [4,4]
		*/
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i+j>=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
