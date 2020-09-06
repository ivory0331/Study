package day2;

public class _26거꾸로큰숫자 { // 두 숫자를 거꾸로 했을때 큰 수를 출력해라

	public static void main(String[] args) {
		int a = 734;
		int b = 893;
		
		int arrA[] = new int[3];
		int arrB[] = new int[3];
		
		// 하나하나 거꾸로 넣어주기
		for(int i=0; i<arrA.length; i++) { 
			arrA[i] = a%10; // arrA[0]=4
			a /= 10;
		}
		for(int i=0; i<arrB.length; i++) {
			arrB[i] = b%10; // arrA[0]=4
			b /= 10;
		}
		
		// 하나로 합치기
		int tranA = 0;
		int mux = 1; // 1->10->100->1000
		for(int i=arrA.length-1; i>=0; i--) {
			tranA += arrA[i]*mux;
			mux*=10;
		}
		int tranB = 0;
		mux = 1; // 1->10->100->1000
		for(int i=arrB.length-1; i>=0; i--) {
			tranB += arrB[i]*mux;
			mux*=10;
		}
		System.out.println(tranA+" "+tranB);
		
		if(tranA>tranB) {
			System.out.println(tranA);
		}
		else {
			System.out.println(tranB);
		}
	}

}
