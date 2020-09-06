package programmers.level1;

import java.util.*;

public class K번째수 {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands= {{2,5,3},{4,4,1},{1,7,3,}};
		
		int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){ // 총 3개의 값 리턴
            int[] tmp = new int[commands[i][1]-commands[i][0]+1]; // 5-2+1 = 4개
            for(int j=0; j<tmp.length; j++){
               tmp[j] = array[commands[i][0]-1+j]; // 5 2 6 3
            }
            Arrays.sort(tmp); // 2 3 5 6 
            answer[i] = tmp[commands[i][2]-1]; // 5
        }
        
        for(int ans : answer) {
        	System.out.print(ans+" ");
        }
        
	}

}
