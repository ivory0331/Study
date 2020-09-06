package day4;

import java.util.Scanner;

public class _10828_stack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // ��� ����
		int arr[] = new int[n]; // ���� ���� �迭
		String input; // ��� �˾ƿ���
		int stack = -1; // ���� ���� -1
		
		for(int i=0; i<n; i++) {
			input = scan.next();
			
			if("push".equals(input)) { //���� X�� ���ÿ� �ִ� �����̴�.
				stack++;
				arr[stack] = scan.nextInt();
			}
			else if("pop".equals(input)) { //���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
				if(stack == -1) {
					System.out.println(stack);
				}
				else {
					System.out.println(arr[stack]);
					stack--;
				}
			}
			else if("size".equals(input)) { //���ÿ� ����ִ� ������ ������ ����Ѵ�
				System.out.println(stack+1);
			}
			else if("empty".equals(input)) { //������ ��������� 1, �ƴϸ� 0�� ����Ѵ�
				if(stack == -1) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else if("top".equals(input)) { //������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�
				if(stack == -1) {
					System.out.println(stack);
				}
				else {
					System.out.println(arr[stack]);
				}
			}			
			
		}
		
		scan.close();
	}

}
