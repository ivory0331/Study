package searching;

public class bruteforce {

	public static void main(String[] args) {
		String s1 = "AB주이지스DEF이지스12";
		String s2 = "이지스";
		
		int idx = bfMatch(s1,s2);
		
		if(idx == -1)
			System.out.println("택스트에 패턴이 없습니다.");
		else {
			int len = 0;
			for(int i=0; i<idx; i++)
				len += s1.substring(i, i+1).getBytes().length; //한글때문에 인코딩
			
			len += s2.length();

			System.out.println(idx+1);
			System.out.printf(String.format("패턴 : %%%ds\n", len), s2); // <-?
		}
		
	}

	static int bfMatch(String txt, String pat) {
		int pt = 0; // txt 원본
		int pp = 0; // pattern 검색할것
		
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if(pp == pat.length())
			return pt - pp; // 일치하는것의 맨 앞 인덱스값
		
		return -1; // 일치하는 것이 없을 경우
	}

}
