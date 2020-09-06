package day4;

import java.util.Scanner;

public class _10828_stack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 명령 개수
		int arr[] = new int[n]; // 스택 저장 배열
		String input; // 명령 알아오기
		int stack = -1; // 없는 경우는 -1
		
		for(int i=0; i<n; i++) {
			input = scan.next();
			
			if("push".equals(input)) { //정수 X를 스택에 넣는 연산이다.
				stack++;
				arr[stack] = scan.nextInt();
			}
			else if("pop".equals(input)) { //스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(stack == -1) {
					System.out.println(stack);
				}
				else {
					System.out.println(arr[stack]);
					stack--;
				}
			}
			else if("size".equals(input)) { //스택에 들어있는 정수의 개수를 출력한다
				System.out.println(stack+1);
			}
			else if("empty".equals(input)) { //스택이 비어있으면 1, 아니면 0을 출력한다
				if(stack == -1) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else if("top".equals(input)) { //스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다
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
