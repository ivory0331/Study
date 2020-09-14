package programmers.level2;

import java.util.*;

public class H_Index { // ���ο���� ������ �������ų� ū ���� ã��

	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		
		System.out.println(solution(citations));
	}
	
	public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); // 0 1 3 5 6 <-�ο��
        
        for(int i=0; i<citations.length; i++) {
        	int H = citations.length-i; //5 4 3 2 1 <- ����
        	
        	if(citations[i] >= H) { // 0 5 / 1 4 /3 3 <-������!
        		answer = H;
        		break;
        	}
        }
        return answer;
    }
}
