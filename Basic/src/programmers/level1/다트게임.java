package programmers.level1;

import java.util.*;

public class 다트게임 {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		int answer = 0;
		
		char[] darts = dartResult.toCharArray();
        int[] score = new int[3];
        int cnt = -1;
 
        for(int i = 0; i < darts.length; i++) {
            if(darts[i] >= '0' && darts[i] <= '9') { // 숫자인 경우
                cnt++;
                if(darts[i] == '1' && darts[i+1] == '0') { // 10 인 경우
                    score[cnt] = 10;
                    i++;
                } else { // 10이 아니라면
                    score[cnt] = darts[i] - '0'; // int형으로 변환
                }
            } else if(darts[i] == 'D') { // 제곱
                score[cnt] *= score[cnt];
            } else if(darts[i] == 'T') { // 세제곱
                score[cnt] *= score[cnt] * score[cnt];
            } else if(darts[i] == '*') { // 스타상인 경우
                if(cnt > 0) { // 앞에 누가 있는 경우
                    score[cnt-1] *= 2; // 앞에도 곱해줌
                }
                score[cnt] *= 2;
            } else if(darts[i] == '#') { // 아차상인 경우
                score[cnt] *= -1;
            }
        }
        
		System.out.println();
	}

}
