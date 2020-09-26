package searching;

public class KMP {

	public static void main(String[] args) {
		String s1 = "AB주이지스DEF이지스12";
		String s2 = "이지스";
		
		int idx = kmpMatch(s1,s2);

		if(idx == -1)
			System.out.println("택스트에 패턴이 없습니다.");
		else {
			System.out.println(idx+1);
		}
	}

	private static int kmpMatch(String txt, String pat) {
		int pt = 1; // txt 원본
		int pp = 0; // pattern 검사할것
		int[] skip = new int[pat.length()+1];
		
		skip[pt] = 0;
		while(pt!=pat.length()) {
			if(pat.charAt(pt) == pat.charAt(pp))
				skip[++pt] = ++pp;
			else if (pp==0)
				skip[++pt] = pp;
			else
				pp = skip[pp];
		}
		
		pt = pp = 0;
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else if (pp == 0)
				pt++;
			else
				pp = skip[pp];
		}
		
		if(pp == pat.length())
			return pt-pp;
		
		return -1;
	}

}
