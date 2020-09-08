package programmers.level2;

public class 카펫 {

	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		
		int[] answer = new int[2];
		int width=0, height=0;
		
		for(int i=1; i<=yellow/2+1; i++) { // 1 2
			width = i;
			height = (yellow%i==0)? yellow/i : yellow/i+1;
			
			// yellow 가로값*2 + (yellow 세로 값*2+4) = brown
			if(width*2 + height*2+4 == brown) break;
		}
		
		answer[0] = Math.max(width+2, height+2);
		answer[1] = Math.min(width+2, height+2);
		
		for(int ans : answer) {
			System.out.print(ans+" ");
		}
		
	}

}
