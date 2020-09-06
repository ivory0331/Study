package day1;

public class _02Fibonacci { // �Ǻ���ġ ����

	public static void main(String[] args) {
		
		//===========1��° ���================
		
		int []arr = new int[100]; // ũ�Ⱑ 100�� �迭�� ����
		
		
		//An = An-1 + An-2; n>=3 -> �̰� �Ǻ���ġ ��� (���� ������ ��ģ�� ���ݰ��� ����������)
		//a1 = 1, a2 = 1 -> �ʱⰪ ����
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
		
		//===========2��° ���================
		//An = An-1 + An-2; n>=3
		//a1 = 1, a2 = 1 --> ������ 3��°���� ������ �Ǳ� ������ �׻� 1,2��°�� �ʱⰪ�� �������־�� �Ѵ�.
		int prevPrevNum = 1; // �� ������ (An-2)
		int prevNum = 1; // �� ����(An-1)
		
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
