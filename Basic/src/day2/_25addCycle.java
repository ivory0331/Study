package day2;

public class _25addCycle { // ����Ŭ ���ϱ�

	public static void main(String[] args) {
		
		int n = 26; // �����ϴ� ��
		int res = n; // �ʱⰪ ������ ���� �̰����� ���
		int cnt = 0; // ����Ŭ�� ������� ����
		
		int mok = 0;
		// 26 2+6=8 => 68 6+8=14 => 84 8+4=12 => 42 4+2=6 26 4��
		// 05 0+5=5 => 55 5+5=10 => 50 5+0=5 3��
		
		do {
			mok = (res/10)+(res%10); // mok = 2+6 = 8
			res = (res%10)*10+(mok%10); // res = 68
			
			cnt++;
		} while (res!=n);
		
		System.out.println(cnt);

	}

}
