package day2;

import java.util.Scanner;

public class _31factorial2 { // ����Լ��� �̿��� ���丮�� ���� Ǯ��

	// ����Լ��� Ż�������� �ݵ�� ��� �Ѵ�.
	
	public static int calFact(int i) {
		
		if(i == 1) {
			return 1; // Ż������!
		}
		
		return i * calFact(i-1);
		
	}
	
	
	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		input = scan.nextInt();
		int answer = 0;
		
		answer = calFact(input);
		
		System.out.println(answer);
	}

}
