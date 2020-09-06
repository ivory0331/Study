package programmers.level1;

import java.util.*;

public class 문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		String[] strings = {"sun","bed","car"};
		int n = 1;
		
		String[] answer = {};
        ArrayList<String> temp = new ArrayList<>();
		
		// strings 를 단어별로 n번째 인덱스 뽑아서 맨 앞에 붙여주기
		for(int i=0; i<strings.length; i++) {
			temp.add(strings[i].charAt(n)+strings[i]);
		}
		Collections.sort(temp);// 누가 앞쪽인지 정렬
		answer = new String[temp.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = temp.get(i).substring(1,temp.get(i).length());
		}
		
		for(String ans : answer) {
			System.out.print(ans+" ");
		}
        

	}

}
