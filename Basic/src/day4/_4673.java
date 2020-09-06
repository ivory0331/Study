package day4;

public class _4673 { // 백준 4673번 - 셀프 넘버
	
	public static int num(int n) { // 생성자가 가능한 수 구하기
		int sum = n; // 1234
		
		while(n != 0) {
			sum += n%10; // 1234+1+2+3+4
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		boolean[] flag = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int n = num(i);
			
			if(n<=10000) {
				flag[n] = true; // 생성자인 숫자 true로 표시
			}
		}
		
		for(int i=1; i<=10000; i++) {
			if(!flag[i]) { // false인 경우(생성자였던 적이 없는 숫자)
				System.out.println(i); // 셀프 넘버 출력
			}
		}

	}

}
