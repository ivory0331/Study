package RecursiveFunction;

import java.util.Scanner;

public class Recur {
	// ��� �Լ�
		static void recur(int n) {
			if (n > 0) {
				recur(n - 1);
				recur(n - 2);
				System.out.print(n+" ");
				
			}
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.print("������ �Է��ϼ���.��");
			int x = scan.nextInt();

			recur(x);
		}
}
