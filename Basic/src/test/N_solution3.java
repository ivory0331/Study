package test;

public class N_solution3 {

	public static void main(String[] args) {
		int[] histogram = {2, 2, 2, 3};
		int answer = 0;
		
		for(int i=0; i<histogram.length/2; i++) {
			for(int j=1+i; j<histogram.length; j++) {
				int x = j-i-1;
				int y = (histogram[i]> histogram[j])?  histogram[j]:histogram[i];
				int sum = x*y; 
				answer = Math.max(answer, sum);
			}
		}
		
		System.out.println(answer);
	}

}
