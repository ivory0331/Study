package programmers.level2;

import java.util.Arrays;

public class 구명보트 {

	public static void main(String[] args) {
		int[] people = {70, 80, 50};
		int limit = 100;
		int answer = 0;
		int index = 0;
		
		Arrays.sort(people); // 50 70 80
		
		for(int i=people.length-1; index<=i; i--) {
			if(people[i]+people[index]>limit) {
				answer++;
			}
			else {
				answer++;
				index++;
			}
			
		}
		
		System.out.println(answer);
	}

}
