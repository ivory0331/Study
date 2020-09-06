package day1;

public class _20_369game { // 3,6,9 게임 만들기

	public static int getNum(int i) { // 3,6,9 가 몇개가 있는지 세주는 메소드
		int j = 0;
		
		while(i > 0) {
			if(i % 10 == 3 ||i % 10 == 6 || i % 10 == 9) {
				j++;
			}
			i /=10; // 1개가 아닐수도 있기 때문에
		}
		
		return j;
	} // end of public static int getNum(int i)-------------------------------------
	
	public static void main(String[] args) {
		int n = 100;
		
		for(int i=1; i<=n; i++) {
			int cnt = getNum(i);
			
			if(cnt == 0) { // 3,6,9 가 없을 경우
				System.out.print(i+" ");
			}
			else { // 3,6,9 중 한개라도 있는 경우
				for(int l=0; l<cnt; l++) {
					System.out.print("짝!");
				}
				System.out.print(" ");
			}
			
		}

	} // end of public static void main(String[] args)-------------------------------

}
