package day2;

import java.util.Scanner;

public class _30PlusMinus { // �Էµ� ���ڱ��� +�� -�� �ݺ��ϱ�

	public static void main(String[] args) {
		
		int n;
		boolean flag = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			if(i == n) {
				System.out.print(i);
				break;
			}
			
			if(flag) {
				System.out.print(i+"+");
				flag = false;
			}
			else {
				System.out.print(i+"-");
				flag = true;
			}
		}

	}

}
