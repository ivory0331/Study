package programmers.level2;

public class 주식가격 {

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		int[] answer = new int[prices.length];
		
		for(int i=0; i<answer.length; i++) {
			for(int j=i+1; j<answer.length; j++) {
				if(prices[i]>prices[j]) {
					answer[i] = j-i;
					break;
				}
				if(j==answer.length-1) answer[i] = j-i;
			}
		}
		
		for(int ans: answer) {
			System.out.print(ans+" ");
		}
	}

}
