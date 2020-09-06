package programmers.level1;

import java.util.*;

public class ���ǰ�� {

	public static void main(String[] args) {
		    int[] answers = {1,2,3,4,5};
		    
	        int[] answer = {};
	        int[] A1 = {1,2,3,4,5};
	        int[] A2 = {2,1,2,3,2,4,2,5};
	        int[] A3 = {3,3,1,1,2,2,4,4,5,5};
	        int a1=0, a2=0, a3=0;
	        
	        for(int i=0; i<answers.length; i++){ // ���� ���� ���غ���
	            if(answers[i] == A1[i%A1.length]){
	                a1++;
	            }
	            if(answers[i] == A2[i%A2.length]){
	                a2++;
	            }
	            if(answers[i] == A3[i%A3.length]){
	                a3++;
	            }
	        }
	        int highScore = Math.max(a1, Math.max(a2, a3)); // �ְ����� ���ϱ�

	        List<Integer> list = new ArrayList<>();
	        if(highScore == a1) {list.add(1);}
	        if(highScore == a2) {list.add(2);}
	        if(highScore == a3) {list.add(3);}
	        
	        answer = new int[list.size()];
	        for(int i=0; i<answer.length; i++){
	            answer[i] = list.get(i);
	        }
	 
	        for(int str: answer) {
	        	System.out.print(str+" ");
	        }
	        
		}

}


