package searching;

public class KMP {

	public static void main(String[] args) {
		String s1 = "AB��������DEF������12";
		String s2 = "������";
		
		int idx = kmpMatch(s1,s2);

		if(idx == -1)
			System.out.println("�ý�Ʈ�� ������ �����ϴ�.");
		else {
			System.out.println(idx+1);
		}
	}

	private static int kmpMatch(String txt, String pat) {
		int pt = 1; // txt ����
		int pp = 0; // pattern �˻��Ұ�
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
