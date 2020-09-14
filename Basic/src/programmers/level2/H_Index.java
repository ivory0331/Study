package programmers.level2;

import java.util.*;

public class H_Index { // 피인용수와 순위가 같아지거나 큰 숫자 찾기

	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		
		System.out.println(solution(citations));
	}
	
	public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); // 0 1 3 5 6 <-인용수
        
        for(int i=0; i<citations.length; i++) {
        	int H = citations.length-i; //5 4 3 2 1 <- 순위
        	
        	if(citations[i] >= H) { // 0 5 / 1 4 /3 3 <-같아짐!
        		answer = H;
        		break;
        	}
        }
        return answer;
    }
}
