package programmers.level1;

import java.util.*;

public class ���α׷���1 { //īī�� ���� �׽�Ʈ

	public static void main(String[] args) {
		int[][] v = {{1,4},{3,4},{3,10}};
		
		int X = v[0][0] ^ v[1][0] ^ v[2][0];
		int Y = v[0][1] ^ v[1][1] ^ v[2][1];
		
		int[] answer = {X,Y};
		for(int ans : answer) {
			System.out.print(ans+" ");
		}
	}

}
