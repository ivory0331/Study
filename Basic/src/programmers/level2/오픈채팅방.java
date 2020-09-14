package programmers.level2;

import java.util.*;

public class ����ä�ù� {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", 
						   "Enter uid4567 Prodo",
						   "Leave uid1234",
						   "Enter uid1234 Prodo",
						   "Change uid4567 Ryan"};
		HashMap<String,String> map = new HashMap<>(); // ���̵� �г��� ����
		List<String> list = new ArrayList<>(); // answer ����
		
		// �̸� ���̵� ����
		for(String R : record) { 
			String[] arr = R.split(" ");
			if(!arr[0].equals("Leave")) map.put(arr[1], arr[2]); // ����� ������ ���̵�� �г��� ����
		}
		
		// ������ ���̵�� �̹��� ����� ���� �ֱ�
		for(String R : record) {
			String[] arr = R.split(" ");
			if(arr[0].equals("Enter"))
				list.add(map.get(arr[1])+"���� ���Խ��ϴ�.");
			else if(arr[0].equals("Leave"))
				list.add(map.get(arr[1])+"���� �������ϴ�.");
		}
		
		// answer�� �־��ֱ�
		String[] answer = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		// ���
		for(String ans : answer) {
			System.out.println(ans);
		}
		

	}

}
