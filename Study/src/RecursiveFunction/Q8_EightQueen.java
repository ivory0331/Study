package RecursiveFunction;

public class Q8_EightQueen {

	static boolean[] flag_a = new boolean[8]; // �� �࿡ ���� �̹� ��ġ�Ǿ� �ִ°�?
	static boolean[] flag_b = new boolean[15]; // ���밢���� ���� �̹� ��ġ�Ǿ� �ִ°�?
	static boolean[] flag_c = new boolean[15]; // ���밢���� ���� �̹� ��ġ�Ǿ� �ִ°�?
	static int[] pos = new int[8]; // �� ���� ���� ��ġ
	
	public static void main(String[] args) {
		set(0);
	}

	static void set(int i) {
		for(int j=0; j<8; j++) {
			if(flag_a[j]==false&&flag_b[i+j]==false&&flag_c[i-j+7]==false) {
				pos[i] = j; // ���� j�� ��ġ
				if(i==7) { // ������ ��ġ ��
					print();
				} else {
					flag_a[j]=flag_b[i+j]=flag_c[i-j+7] = true; // ��ġ�������� true�� ��ȯ
					set(i+1); // �ٽ� ����
					flag_a[j]=flag_b[i+j]=flag_c[i-j+7] = false; // ���� �ʱ�ȭ
				}
			}
		}
		
	}

	static void print() {
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++)
				System.out.printf("%s",j==pos[i]?"��" : "��");
			System.out.println();
		}
		System.out.println();
	}

}
