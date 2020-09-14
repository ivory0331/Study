package programmers.level1;

import java.util.*;

public class ũ���������̱���� {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},
						 {0,0,1,0,3},
						 {0,2,5,0,1},
						 {4,2,4,4,2},
						 {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		Stack<Integer> basket = new Stack<>();
		
		for(int i=0; i<moves.length; i++) {
			for(int k=0; k<board.length; k++) {
				if(board[k][moves[i]-1]!=0) { // �ٱ��Ͽ� ���� �ִٸ�
					if(basket.isEmpty()) {// ��������� �� �ֱ�
						basket.push(board[k][moves[i]-1]);
					} else { // ���� ����ִٸ�
						if(basket.peek()==board[k][moves[i]-1]) { // �ٵ� ������
							basket.pop();
							answer += 2;
						} else { // �ٵ� �ٸ���
							basket.push(board[k][moves[i]-1]);
						}
					}
					board[k][moves[i]-1] = 0;
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
