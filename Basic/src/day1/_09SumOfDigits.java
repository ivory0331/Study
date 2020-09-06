package day1;

public class _09SumOfDigits { // �� �ڸ��� �� ���ϱ�

	public static void main(String[] args) {
		
		int num = 1242;
		int result = 0;
		
		// 1242 -> 123 -> 12 -> 1
		//    2->	 3 ->  2 -> 1   ==> 8
		
		while(num > 0) {
			result += num % 10; // 2+3+2+1
			num /= 10; // 123 12 1
		}
		
		System.out.println(result);
	}

}
