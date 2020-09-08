package programmers.level2;

public class 피보나치수 {

	public static void main(String[] args) {
		int n = 5;
		int answer = 0;
		
		// 0 1 1 2 3 5 8 13 21 ... 
		int prevPrevNum = 1; 
		int prevNum = 1;
		
		if(n==1) answer = prevPrevNum;
		if(n==2) answer = prevNum;
		else {
			for(int i=3; i<=n; i++) {
				answer = prevPrevNum+prevNum;
				answer = answer%1234567;
				prevPrevNum = prevNum;
				prevNum = answer;
			}
		}
		
		System.out.println(answer);
	}

}
