package programmers.level1;

import java.util.*;

public class 체육복 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		
        int answer = n-lost.length; // 일단 잃어버린애들 제외 / 5-2 =3
        Arrays.sort(lost);
        Arrays.sort(reserve);
		// 잃어버린애가 여분이 있었는지 확인
		for(int l : lost) { //2 4
			for(int r : reserve) { //3
				if(r==l) {
					l = -1;
					r = -1;
					answer++; // 잃어버렸지만 여분이 있는 친구이므로
                    break;
				}
			}
		}
		for(int l : lost) { // 2 4
			for(int r : reserve) { // 3
				if(l==r+1 || l==r-1){
					r = -1;
					answer++;
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
