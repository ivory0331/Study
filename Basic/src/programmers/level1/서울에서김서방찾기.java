package programmers.level1;

public class ���￡���輭��ã�� {

	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
        
		String answer = "";
        for(int i=0; i<seoul.length; i++){
            if("Kim".equals(seoul[i])){
                answer += "�輭���� "+i+"�� �ִ�";
            }
        }
        
        System.out.println(answer);
	}

}
