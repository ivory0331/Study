package programmers.level2;

public class 큰수만들기 {

	public static void main(String[] args) {
		String number = "1231234";
		int k = 3;
		
		StringBuilder answer = new StringBuilder();
		int idx = 0;
		int max = 0;

		for(int i=0; i<number.length()-k; i++){
			max = 0;
            for(int j=idx; j<=i+k; j++){
                if(max < number.charAt(j)-'0'){
                	max = number.charAt(j)-'0';
                    idx = j+1;
                }
            }
			answer.append(max);
		}
		System.out.println(answer.toString());
	}

}
