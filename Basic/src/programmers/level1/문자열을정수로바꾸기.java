package programmers.level1;

public class ���ڿ��������ιٲٱ� {

	public static void main(String[] args) {
		String s = "-1234";

		int answer = 0;
		String n ="";
		if(s.charAt(0) != '-') {
			answer = Integer.valueOf(s);
		}else { // �տ� -�� ���� ���
			char temp[] = new char[s.length()];
			temp = s.toCharArray();
			for(int i=1; i<temp.length; i++) {
				n += String.valueOf(temp[i]);
			}
			answer = Integer.valueOf(n);
            answer = answer - (answer*2);
		}
        System.out.println(answer);
		
	}

}
