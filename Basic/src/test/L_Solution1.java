package test;

import java.util.*;

public class L_Solution1 {

	public static void main(String[] args) {
		int[][] boxes = {{1,2},{3,4},{5,6}};
		int answer = 0;
		
		int[] box = new int[boxes.length*boxes[0].length];
		
		for(int i=0; i<boxes.length; i++) {
		      for(int j=0; j<boxes[i].length; j++) {
		        //2차원 배열의 원소를 1차원 배열의 원소로 이동.
		    	box[( i * boxes[i].length ) + j ] = boxes[i][j];
		      }
		    }
		
		Arrays.sort(box);//1,1,2,2,3,3,4,5,5,6,7,8
		String temp = "";
		for(int i=0; i<box.length-1; i++) {
			
			if(box[i]==box[i+1]) {
				++i;
			}else {
				temp+=box[i];
				if(box.length-1==i+1) temp+=box[i+1];
			}
		}
		
		answer = temp.length()/2;
		System.out.println(answer);
	/*	
		for(int d : box) {
			System.out.print(d+",");
		}
	*/	
		
	}

}
