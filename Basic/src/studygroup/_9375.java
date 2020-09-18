package studygroup;

import java.util.*;

public class _9375 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //2
		for(int i=0; i<n; i++) {
			int answer = 1;
			HashMap<String, Integer> map = new HashMap<>();
			int k = scan.nextInt(); //3
			for(int j=0; j<k; j++) {
				scan.next();
				String clothes = scan.next();
				
				if(map.isEmpty()) map.put(clothes, 1);
				else{
					if(map.containsKey(clothes)) { // 같은 옷이 있는지 검사
						map.put(clothes, map.get(clothes)+1); // 있으면 수량 추가
					}else {
						map.put(clothes, 1); // 없으면 새로 만들기
					}
				}
			}//------------------------------
			for(String key : map.keySet()) {
				answer *= (map.get(key)+1);
			}
			System.out.println(answer-1);
		}//---------------------------------------
		scan.close();
	}
}