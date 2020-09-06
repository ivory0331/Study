package programmers.level1;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		
		int[] answer = new int[2];
		int big, small;
		if(n>m) {
			big = n;
			small = m;
		} else {
			big = m;
			small = n;
		}		
		int temp = 1;
		while(temp>0) {
			temp = big%small;// temp = 5%2 = 1 / 2%1 == 0
			big = small; // big = 2 / big = 1
			small = temp; // small = 1 / small = 0
		}
		answer[0] = big; //1
		answer[1] = n*m/big; //10/1
		
		for(int ans : answer) {
			System.out.print(ans+" ");
		}
       
	}

}
