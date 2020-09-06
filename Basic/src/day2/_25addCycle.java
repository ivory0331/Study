package day2;

public class _25addCycle { // 사이클 구하기

	public static void main(String[] args) {
		
		int n = 26; // 시작하는 수
		int res = n; // 초기값 저장을 위해 이것으로 계산
		int cnt = 0; // 사이클이 몇번인지 세기
		
		int mok = 0;
		// 26 2+6=8 => 68 6+8=14 => 84 8+4=12 => 42 4+2=6 26 4번
		// 05 0+5=5 => 55 5+5=10 => 50 5+0=5 3번
		
		do {
			mok = (res/10)+(res%10); // mok = 2+6 = 8
			res = (res%10)*10+(mok%10); // res = 68
			
			cnt++;
		} while (res!=n);
		
		System.out.println(cnt);

	}

}
