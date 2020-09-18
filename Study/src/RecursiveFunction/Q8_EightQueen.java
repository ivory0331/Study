package RecursiveFunction;

public class Q8_EightQueen {

	static boolean[] flag_a = new boolean[8]; // 각 행에 퀸이 이미 배치되어 있는가?
	static boolean[] flag_b = new boolean[15]; // ／대각선에 퀸이 이미 배치되어 있는가?
	static boolean[] flag_c = new boolean[15]; // ＼대각선에 퀸이 이미 배치되어 있는가?
	static int[] pos = new int[8]; // 각 열의 퀸의 위치
	
	public static void main(String[] args) {
		set(0);
	}

	static void set(int i) {
		for(int j=0; j<8; j++) {
			if(flag_a[j]==false&&flag_b[i+j]==false&&flag_c[i-j+7]==false) {
				pos[i] = j; // 퀸을 j에 배치
				if(i==7) { // 모든곳에 배치 끝
					print();
				} else {
					flag_a[j]=flag_b[i+j]=flag_c[i-j+7] = true; // 배치끝났으면 true로 변환
					set(i+1); // 다시 실행
					flag_a[j]=flag_b[i+j]=flag_c[i-j+7] = false; // 새로 초기화
				}
			}
		}
		
	}

	static void print() {
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++)
				System.out.printf("%s",j==pos[i]?"■" : "□");
			System.out.println();
		}
		System.out.println();
	}

}
