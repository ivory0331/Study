package day4;

public class _4673 { // ���� 4673�� - ���� �ѹ�
	
	public static int num(int n) { // �����ڰ� ������ �� ���ϱ�
		int sum = n; // 1234
		
		while(n != 0) {
			sum += n%10; // 1234+1+2+3+4
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		boolean[] flag = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int n = num(i);
			
			if(n<=10000) {
				flag[n] = true; // �������� ���� true�� ǥ��
			}
		}
		
		for(int i=1; i<=10000; i++) {
			if(!flag[i]) { // false�� ���(�����ڿ��� ���� ���� ����)
				System.out.println(i); // ���� �ѹ� ���
			}
		}

	}

}
