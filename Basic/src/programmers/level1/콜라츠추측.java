package programmers.level1;

public class ÄÝ¶óÃ÷ÃßÃø {

	public static void main(String[] args) {
		long num = 6;
		
		int answer = 0;
        while(num != 1){
            if(num%2==0){// Â¦¼ö¶ó¸é
                num/=2; 
            }else{// È¦¼ö¶ó¸é
                num = num*3+1;
            }
            answer++;
            if(answer==500){
                answer = -1;
                break;
            }
        }
        System.out.println(answer);

	}

}
