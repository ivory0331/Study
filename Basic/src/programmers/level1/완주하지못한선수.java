package programmers.level1;

import java.util.*;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"eden","kiki"};
		
		String answer = "";
        HashMap<String, Integer> hashmap = new HashMap<>();
        
        for (String player : participant) // player = leo kiki eden
            hashmap.put(player, hashmap.getOrDefault(player, 0) + 1); // hashmap (leo, 1)(kiki, 1)(eden, 1)
        // 여기서 getOrDefault는 해당 값이 존재하면 0 그리고 +1로 표시
        
        for (String player : completion) // player = eden kiki
            hashmap.put(player, hashmap.get(player) - 1); // hashmap(eden, 0)(kiki, 0)
        // player에 각각 -1을 해줌
        // 참가자 (모두 1) 완주자인 사람(-1해서 0됨)
        
        for (String key : hashmap.keySet()) {// keySet()은 다 소환하고 싶은데 key값만 필요한 경우에 사용 | key = leo kiki eden
            if (hashmap.get(key) != 0) // 완주를 못해서 -1을 안한 사람(=0이 아닌 사람) | value값 비교
                answer = key;
        }
        
        System.out.println(answer);

	}

}
