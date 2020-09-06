package day1;

public class _07PrimeNumber { // 소수인지 구별하기

	public static void main(String[] args) {
		
		int num = 13;
		
		// 소수 -> 1과 자기자신을 제외하고 나누어 떨어지는 약수가 없는 숫자
		
		boolean isPrimeNumber = true;
		
		for(int i=2; i<=num-1; i++) { // 1부터 13까지 나누도록. 단 1과 자기자신은 제외(어차피 모든 숫자에 해당하니까)
			if(num % i == 0) {
				// 여기 오면 primeNumber가 아님
				isPrimeNumber = false;
			}
		}
		
		if(isPrimeNumber) {
			System.out.println(num+" 은 소수 입니다");
		}
		else {
			System.out.println(num+" 은 소수가 아닙니다");
		}
	}

	
	// for문에서 i<=num-1; 대신에 i<= num/2라고 해도 답이 나온다.
}
