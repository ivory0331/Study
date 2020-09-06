package day1;

public class _20_369game { // 3,6,9 ���� �����

	public static int getNum(int i) { // 3,6,9 �� ��� �ִ��� ���ִ� �޼ҵ�
		int j = 0;
		
		while(i > 0) {
			if(i % 10 == 3 ||i % 10 == 6 || i % 10 == 9) {
				j++;
			}
			i /=10; // 1���� �ƴҼ��� �ֱ� ������
		}
		
		return j;
	} // end of public static int getNum(int i)-------------------------------------
	
	public static void main(String[] args) {
		int n = 100;
		
		for(int i=1; i<=n; i++) {
			int cnt = getNum(i);
			
			if(cnt == 0) { // 3,6,9 �� ���� ���
				System.out.print(i+" ");
			}
			else { // 3,6,9 �� �Ѱ��� �ִ� ���
				for(int l=0; l<cnt; l++) {
					System.out.print("¦!");
				}
				System.out.print(" ");
			}
			
		}

	} // end of public static void main(String[] args)-------------------------------

}
