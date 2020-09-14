package programmers.level2;

import java.util.*;

public class 오픈채팅방 {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", 
						   "Enter uid4567 Prodo",
						   "Leave uid1234",
						   "Enter uid1234 Prodo",
						   "Change uid4567 Ryan"};
		HashMap<String,String> map = new HashMap<>(); // 아이디 닉네임 저장
		List<String> list = new ArrayList<>(); // answer 저장
		
		// 미리 아이디 정리
		for(String R : record) { 
			String[] arr = R.split(" ");
			if(!arr[0].equals("Leave")) map.put(arr[1], arr[2]); // 입장과 변경은 아이디랑 닉네임 저장
		}
		
		// 정리한 아이디로 이번엔 출력할 문장 넣기
		for(String R : record) {
			String[] arr = R.split(" ");
			if(arr[0].equals("Enter"))
				list.add(map.get(arr[1])+"님이 들어왔습니다.");
			else if(arr[0].equals("Leave"))
				list.add(map.get(arr[1])+"님이 나갔습니다.");
		}
		
		// answer에 넣어주기
		String[] answer = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		// 출력
		for(String ans : answer) {
			System.out.println(ans);
		}
		

	}

}
