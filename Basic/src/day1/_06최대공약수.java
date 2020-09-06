package day1;

public class _06최대공약수 { //최대공약수 구하기

	public static void main(String[] args) {
		
		int num1, num2;
		num1 = 12;
		num2 = 18;
		
		int small;
		int big;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1; // 최대공약수
		
		for (int i=1; i<=small; i++) { // 12까지 나눠봄
			if(big % i == 0 && small % i == 0 )
				gcd = i; //계속 갱신이 된다.
		}
		
		System.out.println(gcd);
	}

}
