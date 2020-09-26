package test;

public class N_solution2 {

	public static void main(String[] args) {
		int N = 3;
		int answer = 0;
		int x = N/2;
		
		int sum = 1;
		
		if(N%2==0) {
			for(int i=1; i<=x; i++) {
				sum *= i;
			}
			answer = sum+2;
		}else {
			for(int i=1; i<=x; i++)
				sum *= i;
			answer += sum+1;
		}
		
		System.out.println(answer);
	}

}
