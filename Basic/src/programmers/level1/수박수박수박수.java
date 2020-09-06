package programmers.level1;

public class 수박수박수박수 {

	public static void main(String[] args) {
		int n = 3;
		
		String answer = "";
        
        for(int i=0; i<n; i++){
            if(i==0)
                answer += "수";
            else{
                if(i%2 != 0)
                    answer +="박";
                else
                    answer +="수";
            }
        }

        System.out.println(answer);
        
	}

}
