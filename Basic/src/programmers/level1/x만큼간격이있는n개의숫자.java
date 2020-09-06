package programmers.level1;

public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		
		long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i] = x*(i+1); // answer가 long타입이므로 x가 long타입이어야 함
        }

        for(long ans : answer) {
        	System.out.print(ans+" ");
        }

	}

}
