package day1;

public class _14countNum { // �Էµ� ������ ���� ���ϱ�

	public static void main(String[] args) {
		int n = 421314218;
		
		int arr[] = new int[10]; // 0~9 �Էµ� ���� cnt ���� �뵵
		// int arr[0] = 0;
		// int arr[1] = 3;
		// int arr[4] = 2; �̷������� ������ ������ �־���

		
		// ===== ���� �־��ִ� �κ� =====
		while(n > 0) {
			arr[n%10]++;
			n /= 10;
		}
		
		// ===== ��ºκ� =====
		for(int i = 0; i< 10; i++) {
			System.out.println(i+": "+arr[i]);
		}
		
	}

}
