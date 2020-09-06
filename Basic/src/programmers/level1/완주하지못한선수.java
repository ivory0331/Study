package programmers.level1;

import java.util.*;

public class �����������Ѽ��� {

	public static void main(String[] args) {
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"eden","kiki"};
		
		String answer = "";
        HashMap<String, Integer> hashmap = new HashMap<>();
        
        for (String player : participant) // player = leo kiki eden
            hashmap.put(player, hashmap.getOrDefault(player, 0) + 1); // hashmap (leo, 1)(kiki, 1)(eden, 1)
        // ���⼭ getOrDefault�� �ش� ���� �����ϸ� 0 �׸��� +1�� ǥ��
        
        for (String player : completion) // player = eden kiki
            hashmap.put(player, hashmap.get(player) - 1); // hashmap(eden, 0)(kiki, 0)
        // player�� ���� -1�� ����
        // ������ (��� 1) �������� ���(-1�ؼ� 0��)
        
        for (String key : hashmap.keySet()) {// keySet()�� �� ��ȯ�ϰ� ������ key���� �ʿ��� ��쿡 ��� | key = leo kiki eden
            if (hashmap.get(key) != 0) // ���ָ� ���ؼ� -1�� ���� ���(=0�� �ƴ� ���) | value�� ��
                answer = key;
        }
        
        System.out.println(answer);

	}

}
