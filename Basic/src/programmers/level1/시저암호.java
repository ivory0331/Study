package programmers.level1;

public class 시저암호 {

	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;

		String answer = "";
        
        for(char str : s.toCharArray()){
            
            if(str == ' '){
                answer += str;
            }
            else if('a'<=str && str<='z'){
                answer += (char)('a' + (str + n - 'a')%26);
            }
            else{
                answer += (char)('A' + (str + n - 'A')%26);
            }
        }
        System.out.println(answer);
	}

}
