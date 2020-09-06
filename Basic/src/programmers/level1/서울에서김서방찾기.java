package programmers.level1;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
        
		String answer = "";
        for(int i=0; i<seoul.length; i++){
            if("Kim".equals(seoul[i])){
                answer += "김서방은 "+i+"에 있다";
            }
        }
        
        System.out.println(answer);
	}

}
