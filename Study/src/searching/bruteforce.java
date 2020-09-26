package searching;

public class bruteforce {

	public static void main(String[] args) {
		String s1 = "AB��������DEF������12";
		String s2 = "������";
		
		int idx = bfMatch(s1,s2);
		
		if(idx == -1)
			System.out.println("�ý�Ʈ�� ������ �����ϴ�.");
		else {
			int len = 0;
			for(int i=0; i<idx; i++)
				len += s1.substring(i, i+1).getBytes().length; //�ѱ۶����� ���ڵ�
			
			len += s2.length();

			System.out.println(idx+1);
			System.out.printf(String.format("���� : %%%ds\n", len), s2); // <-?
		}
		
	}

	static int bfMatch(String txt, String pat) {
		int pt = 0; // txt ����
		int pp = 0; // pattern �˻��Ұ�
		
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
			return pt - pp; // ��ġ�ϴ°��� �� �� �ε�����
		
		return -1; // ��ġ�ϴ� ���� ���� ���
	}

}
