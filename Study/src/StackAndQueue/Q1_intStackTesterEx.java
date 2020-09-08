package StackAndQueue;

import java.util.Scanner;

public class Q1_intStackTesterEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		IntStack s = new IntStack(64);	// �ִ� 64���� Ǫ���� �� �ִ� ����

		while (true) {
			System.out.println("���� ������ ����" + s.size() + " / "+ s.capacity());
			System.out.print("(1)Ǫ�á�(2)�ˡ�(3)��ũ��(4)����  (5)�˻� (6)��� (7)����ǥ�� (0)���� : ");

			int menu = scan.nextInt();
			if (menu == 0) break; // ����

			int x;
			switch (menu) {
			 case 1: // Ǫ��
				System.out.print("�����ͣ�");
				x = scan.nextInt();
				try {
					s.push(x);
			 	} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			 case 2: // ��
				try {
			 		x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 3: // ��ũ
				try {
			 		x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 4: // ����
				s.dump();
				break;
			
			 case 5: // �˻�
				System.out.print("�˻��� ������ : ");
				x = scan.nextInt();
				int n = s.indexOf(x);
				if(n >= 0) { // -1�� �ƴ϶�� <- �����Ѵٸ�
					System.out.println("�������� "+(s.size()-n)+"�� °�� �ֽ��ϴ�.");
				}else {
					System.out.println("�ش� �����ʹ� �����ϴ�.");
				}
				break;
				
			 case 6: // ���
				s.clear();
				break;
				
			 case 7: // ����ǥ��
			 	System.out.println("�뷮��" + s.capacity());
				System.out.println("������ ����" + s.size());
				System.out.println("��� " + (s.isEmpty() ? "�ֽ��ϴ�." : "���� �ʽ��ϴ�."));
				System.out.println("���� " + (s.isFull() ? "á���ϴ�." : "���� �ʾҽ��ϴ�."));
				break;
			}
		}
		scan.close();
	}

}
