package test;

import java.util.*;

public class C_solution1 {

	public static void main(String[] args) {
		int N = 14;
		int[] answer = {0,0};
		int max = 1, jin = 1;
		
		for(int i=2; i<=10; i++) {
			String character = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        List<Character> output = new ArrayList<>();
	        int sum = 1;
			int mok = N;
			while(mok != 0) {
				output.add(character.charAt(mok%i));
				mok /= i;
			}
			Collections.reverse(output);
			
			for(Character c : output) {
				if(c!='0')
					sum = sum *(c-'0');
			}
			if(max<=sum) {
				max = sum;
				jin = i;
			}
		}
		answer[0] = jin;
		answer[1] = max;
		
		for(int a : answer)
			System.out.print(a+" ");
	}
}
