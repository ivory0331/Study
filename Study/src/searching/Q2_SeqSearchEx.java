package searching;

import java.util.*;

public class Q2_SeqSearchEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = scan.nextInt();
		int[] x = new int[num]; // ��ڼ� num�� �迭

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = scan.nextInt();
		}

		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int ky = scan.nextInt();

		int idx = seqSearchEx(x, num, ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "�� " + "x[" + idx + "]�� �ֽ��ϴ�.");


	}

	private static int seqSearchEx(int[] a, int n, int key) {
		
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // �˻�����
		}
		
		return -1; // �˻�����

	}

}
