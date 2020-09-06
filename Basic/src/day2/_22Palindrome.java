package day2;

public class _22Palindrome { // 팰린드롬인지 판별 (가운데를 대칭으로 문자가 같은경우)

	public static void main(String[] args) {
		
		String n = "12321";
		int len = n.length();
		boolean flag = true;
		
		for(int i=0; i<len/2; i++) {
			if(n.charAt(i) != n.charAt(len-1-i)) {
				flag = false;
			}
		}
		System.out.println(flag);
	}

}
