package day1;

public class _02Fibonacci { // 피보나치 수열

	public static void main(String[] args) {
		
		//===========1번째 방법================
		
		int []arr = new int[100]; // 크기가 100인 배열을 만듦
		
		
		//An = An-1 + An-2; n>=3 -> 이게 피보나치 방식 (전꺼 전전꺼 합친게 지금값이 나오도록함)
		//a1 = 1, a2 = 1 -> 초기값 설정
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i=1; i<=10; i++) {
			System.out.print(arr[i]+" ");
			//1 1 2 3 5 8 13 21 34 55
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//===========2번째 방법================
		//An = An-1 + An-2; n>=3
		//a1 = 1, a2 = 1 --> 수식이 3번째부터 적용이 되기 때문에 항상 1,2번째는 초기값을 설정해주어야 한다.
		int prevPrevNum = 1; // 그 전전것 (An-2)
		int prevNum = 1; // 그 전것(An-1)
		
		System.out.print(prevPrevNum+" "); // 1
		System.out.print(prevNum+" "); // 1
		
		for(int i=3; i<=10; i++) {
			int nNum = prevPrevNum+prevNum; 
			System.out.print(nNum+" "); // 3
			
			prevPrevNum = prevNum; 
			prevNum = nNum;
			// 1 1 2 3 5 8 13 21 34 55
		}
		
	}

}
