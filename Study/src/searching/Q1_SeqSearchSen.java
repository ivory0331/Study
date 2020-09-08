package searching;

import java.util.Scanner;

public class Q1_SeqSearchSen { // 115p - Q1

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = scan.nextInt();
		
		// ������ �־��ֱ�
		int[] x = new int[num+1];
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int key = scan.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		
		scan.close();
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(key+"��(��) x["+idx+"] �� �ֽ��ϴ�.");
		}

	}

	private static int seqSearchSen(int[] x, int num, int key) {
		
		int a = -1;
		for(int i=0; i<num; i++) {
			if(x[i]==key) {
				a = i;
			} 
		}
		return a;
	}

}
