package day1;

public class _04DecToBin { // 10������ 2������ ��ȯ

	public static void main(String[] args) {
		
		int inputNum = 19; //2������ ��ȯ�ϰ� ���� 10���� �ֱ�
		int bin[] = new int[100]; // 2������ ��ȯ�Ȱ��� ���� �迭
		
	/*
		19 / 2	 9 ... 1
		 9 / 2	 4 ... 1
		 4 / 2	 2 ... 0
		 2 / 2	 1 ... 0
		 1 / 2	 0 ... 1
		
		 10011 => 19
	*/
		
		int i = 0; 
		int mok = inputNum;
		
		while(mok > 0) { //mok�� 0�� ���Ë� ���ߵ���
			bin[i] = mok % 2;  // bin[0] == 1 / bin[1] == 1 / bin[2] == 0 / bin[3] == 0 / bin[4] == 1
			mok /= 2; // mok = 9 / mok = 4 / mok = 2 / mok = 1 / mok = 0
			i++;
		}
		
		i--; //�������� i�� 5�� �Ǿ��� ������ ���ش�
		
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
		//10011
	}

}
