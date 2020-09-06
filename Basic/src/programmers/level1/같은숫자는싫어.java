package programmers.level1;

import java.util.*;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int arr[] = {1,1,3,3,0,1,1};
		
		ArrayList<Integer> temp = new ArrayList<>();
        int preNum = -1; // 절대 같지 않을 숫자 아무거나
        for(int num : arr){
            if(preNum != num) {//10 1/1 3/3 0/0 1
                temp.add(num);// 1 3 0 1
            }
            preNum = num;
        }
        int[] answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){ // answer 에 넣어줌
            answer[i] = temp.get(i);
        }
        
        for(int ans : answer) {
        	System.out.print(ans+" ");
        }
        

	}

}
