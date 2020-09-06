package day1;

public class _04DecToBin { // 10진수를 2진수로 변환

	public static void main(String[] args) {
		
		int inputNum = 19; //2진수로 변환하고 싶은 10진수 넣기
		int bin[] = new int[100]; // 2진수로 변환된것을 넣을 배열
		
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
		
		while(mok > 0) { //mok이 0이 나올떄 멈추도록
			bin[i] = mok % 2;  // bin[0] == 1 / bin[1] == 1 / bin[2] == 0 / bin[3] == 0 / bin[4] == 1
			mok /= 2; // mok = 9 / mok = 4 / mok = 2 / mok = 1 / mok = 0
			i++;
		}
		
		i--; //마지막에 i가 5가 되었기 때문에 뺴준다
		
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
		//10011
	}

}
