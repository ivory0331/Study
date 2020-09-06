package day1;

public class _14countNum { // 입력된 숫자의 개수 구하기

	public static void main(String[] args) {
		int n = 421314218;
		
		int arr[] = new int[10]; // 0~9 입력된 수를 cnt 위한 용도
		// int arr[0] = 0;
		// int arr[1] = 3;
		// int arr[4] = 2; 이런식으로 숫자의 개수를 넣어줌

		
		// ===== 값을 넣어주는 부분 =====
		while(n > 0) {
			arr[n%10]++;
			n /= 10;
		}
		
		// ===== 출력부분 =====
		for(int i = 0; i< 10; i++) {
			System.out.println(i+": "+arr[i]);
		}
		
	}

}
