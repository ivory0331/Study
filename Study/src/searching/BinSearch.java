package searching;

import java.util.Scanner;

public class BinSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����� ���� : "); // 11
		int n = scan.nextInt();
		
		System.out.print("�˻��� �� : "); // 7
		int key = scan.nextInt();
		
		int[] a = new int[n];
		System.out.println("�� �ֱ�"); // 1 3 5 7 7 7 7 7 8 8 9 9
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		int answer = binSearchX(a, n, key);
		
		if(answer == -1 ) {
			System.out.println("��ã����");
		}else {
			System.out.println(answer+"�� ����");
		}
	}

	private static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2; // �߾ӿ���� index
			
			if (a[pc] == key) {
				for (; pc > pl; pc--) { // �߾�index���� ������ ��Ӥ���
					if (a[pc - 1] < key)
						break;
				}
				return pc; // �˻�����
			}
			else if (a[pc] < key)
				pl = pc + 1; // �˻������� ���� �������� ����
			else
				pr = pc - 1; // �˻������� ���� �������� ����
			
		} while (pl <= pr);
		
		return -1;
	}

}
