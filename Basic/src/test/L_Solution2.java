package test;

public class L_Solution2 {

	public static void main(String[] args) {
		int n = 10007;
		int[] answer = new int[2];
		int count = 0;
		
		if(n<10) {
			count = 0;
		}else {
			do {
				n = Minn(n);
				count++;
			} while (n>10);
		}
		answer[0] = count;
		answer[1] = n;
		
		for(int s : answer) {
			System.out.println(s);
		}
		
	}

	public static int Minn(int n) {
		int r = repeat(n); // 계산 반복 횟수 4
		String N = String.valueOf(n);//10007
		int[] temp = new int[r];
		for(int i=0; i<r; i++) {
			int A = Integer.parseInt(N.substring(0, 1+i)); //1
			
			if(N.substring(1+i).charAt(0)!='0') { //0007
				int B = Integer.parseInt(N.substring(1+i));
				temp[i] = A+B;
			} else {
				temp[i] = 999999999;
			}
		}
		int min = temp[0];
		for(int t=1; t<temp.length; t++) {
			if(min>temp[t]) min = temp[t];
		}
		return min;
	}

	public static int repeat(int n) {
		int cnt = 0;
		do {
			n = n/10;
			cnt++;
		} while (n>=10);
		
		return cnt;
	}

}
