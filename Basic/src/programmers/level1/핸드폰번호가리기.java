package programmers.level1;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		String phone_number = "01033334444";

		String answer = "";
        char[] num = new char[phone_number.length()];
        num = phone_number.toCharArray();
        
        for(int i=0; i<num.length; i++) { // num.length = 11
        	if(num.length-4<=i && num.length>i) // 7<i<11 -> 7 8 9 10
        		answer += num[i];
        	else 
        		answer += "*";
        }
        
        System.out.println(answer);
	}

}
