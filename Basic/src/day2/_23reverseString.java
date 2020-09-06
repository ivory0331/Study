package day2;

public class _23reverseString { // 문자열 뒤집기

	public static void main(String[] args) {
		
		String n = "ADEFH";
		
		char str[] = n.toCharArray();
		char tmp;
		int len = str.length;
		
		for(int i=0; i<len/2; i++) {
			tmp = str[i]; // tmp = A / tmp = D
			str[i] = str[len-i-1]; // str[0] = H / str[1] = F
			str[len-i-1] = tmp; // str[4] = A / str[3] = D
		}
		
		n = new String(str);
		System.out.println(n);
		
	}

}
