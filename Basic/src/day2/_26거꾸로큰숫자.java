package day2;

public class _26�Ųٷ�ū���� { // �� ���ڸ� �Ųٷ� ������ ū ���� ����ض�

	public static void main(String[] args) {
		int a = 734;
		int b = 893;
		
		int arrA[] = new int[3];
		int arrB[] = new int[3];
		
		// �ϳ��ϳ� �Ųٷ� �־��ֱ�
		for(int i=0; i<arrA.length; i++) { 
			arrA[i] = a%10; // arrA[0]=4
			a /= 10;
		}
		for(int i=0; i<arrB.length; i++) {
			arrB[i] = b%10; // arrA[0]=4
			b /= 10;
		}
		
		// �ϳ��� ��ġ��
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
