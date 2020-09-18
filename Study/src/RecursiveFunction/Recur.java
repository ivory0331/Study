package RecursiveFunction;

import java.util.Scanner;

public class Recur {
	// 재귀 함수
		static void recur(int n) {
			if (n > 0) {
				recur(n - 1);
				recur(n - 2);
				System.out.print(n+" ");
				
			}
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.print("정수를 입력하세요.：");
			int x = scan.nextInt();

			recur(x);
		}
}
