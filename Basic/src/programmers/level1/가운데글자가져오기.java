package programmers.level1;

public class ������ڰ������� {

	public static void main(String[] args) {
		String s = "abcde";
		
		String answer = "";
        if(s.length()%2!=0) { // ¦���� ���
        	answer = String.valueOf(s.charAt(s.length()/2));
        }else { // Ȧ���� ���
        	answer += String.valueOf(s.charAt(s.length()/2-1));
        	answer += String.valueOf(s.charAt(s.length()/2));
        }
        System.out.println(answer);

	}

}
