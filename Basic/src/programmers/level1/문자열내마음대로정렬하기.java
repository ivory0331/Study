package programmers.level1;

import java.util.*;

public class ���ڿ���������������ϱ� {

	public static void main(String[] args) {
		String[] strings = {"sun","bed","car"};
		int n = 1;
		
		String[] answer = {};
        ArrayList<String> temp = new ArrayList<>();
		
		// strings �� �ܾ�� n��° �ε��� �̾Ƽ� �� �տ� �ٿ��ֱ�
		for(int i=0; i<strings.length; i++) {
			temp.add(strings[i].charAt(n)+strings[i]);
		}
		Collections.sort(temp);// ���� �������� ����
		answer = new String[temp.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = temp.get(i).substring(1,temp.get(i).length());
		}
		
		for(String ans : answer) {
			System.out.print(ans+" ");
		}
        

	}

}
