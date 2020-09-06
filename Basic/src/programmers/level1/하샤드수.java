package programmers.level1;

public class ÇÏ»þµå¼ö {

	public static void main(String[] args) {
		int x = 10;
		
		boolean answer = false;
        int n = 0;
        int X = x; //18
        while(X>0){ 
            n += X%10; // 8+1
            X/=10;
        }
        if(x%n==0){
            answer = true;
        }
        
        System.out.println(answer);

	}

}
