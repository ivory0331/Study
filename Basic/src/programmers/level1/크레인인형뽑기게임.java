package programmers.level1;

import java.util.*;

public class 크레인인형뽑기게임 {

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
				if(board[k][moves[i]-1]!=0) { // 바구니에 무언가 있다면
					if(basket.isEmpty()) {// 비어있으면 걍 넣기
						basket.push(board[k][moves[i]-1]);
					} else { // 뭔가 들어있다면
						if(basket.peek()==board[k][moves[i]-1]) { // 근데 같으면
							basket.pop();
							answer += 2;
						} else { // 근데 다르면
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
