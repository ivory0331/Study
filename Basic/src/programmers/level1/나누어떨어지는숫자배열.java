package programmers.level1;

import java.util.*;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int arr[] = {5,9,7,10};
		int divisor = 5;
		
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int num : arr) {
			if(num%divisor==0) {
				a.add(num);
			}
		}
		if(a.size()==0) {
			a.add(-1);
		}
		Collections.sort(a);
		
		int[] answer = new int[a.size()];
		int tmp = 0;
		for(int t : a) {
			answer[tmp++] = t;
		}
		
		for(int ans : answer) {
			System.out.print(ans+" ");
		}
        

	}

}
