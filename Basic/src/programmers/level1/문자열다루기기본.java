package programmers.level1;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		String s = "a234";
		
		boolean answer = true;
        char[] chr = s.toCharArray();
		if(chr.length !=4 && chr.length !=6) {
			answer = false;
		}
		else {
			for(int i=0; i<chr.length; i++){
	            if(!('0'<=chr[i] && chr[i] <= '9' )){
	                answer = false;
	            }
	        }
		}
		
        System.out.println(answer);

	}

}
