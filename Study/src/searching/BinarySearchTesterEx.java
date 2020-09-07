package searching;

import java.util.*;

public class BinarySearchTesterEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = scan.nextInt();
		int[] x = new int[num];			// ��ڼ��� num�� �迭

		System.out.println("������������ �Է��ϼ���.");

		System.out.print("x[0]��");		// �迭�� ù ��Ҹ� ���� �Է��մϴ�.
		x[0] = scan.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]��");
				x[i] = scan.nextInt();
			} while (x[i] < x[i - 1]);	// �ٷ� ���� ��Һ��� ������ �ٽ� �Է��մϴ�.
		}

		System.out.print("�˻��� ����");	// Ű ���� �Է� ����
		int ky = scan.nextInt();

		int idx = Arrays.binarySearch(x, ky);	// �迭 x���� Ű ���� ky�� ��Ҹ� �˻�

		if (idx < 0) {
			int xPoint = -idx - 1;
			System.out.println("�� ���� ��Ұ� �����ϴ�. ��������Ʈ�� "+xPoint+"�Դϴ�.");
		}
			
		else
			System.out.println(ky+"��(��) x[" + idx + "]�� �ֽ��ϴ�.");


	}

}
