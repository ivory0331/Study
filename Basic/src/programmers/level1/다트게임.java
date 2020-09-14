package programmers.level1;

import java.util.*;

public class ��Ʈ���� {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		int answer = 0;
		
		char[] darts = dartResult.toCharArray();
        int[] score = new int[3];
        int cnt = -1;
 
        for(int i = 0; i < darts.length; i++) {
            if(darts[i] >= '0' && darts[i] <= '9') { // ������ ���
                cnt++;
                if(darts[i] == '1' && darts[i+1] == '0') { // 10 �� ���
                    score[cnt] = 10;
                    i++;
                } else { // 10�� �ƴ϶��
                    score[cnt] = darts[i] - '0'; // int������ ��ȯ
                }
            } else if(darts[i] == 'D') { // ����
                score[cnt] *= score[cnt];
            } else if(darts[i] == 'T') { // ������
                score[cnt] *= score[cnt] * score[cnt];
            } else if(darts[i] == '*') { // ��Ÿ���� ���
                if(cnt > 0) { // �տ� ���� �ִ� ���
                    score[cnt-1] *= 2; // �տ��� ������
                }
                score[cnt] *= 2;
            } else if(darts[i] == '#') { // �������� ���
                score[cnt] *= -1;
            }
        }
        
		System.out.println();
	}

}
