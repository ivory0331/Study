package programmers.level2;

public class 조이스틱 { // 이거 이해 못함

	public static void main(String[] args) {
		String name = "JAN";
		int answer = 0;
		int len = name.length();
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) != 'A') {
				int up = name.charAt(i)-'A';
				int down = 'Z'-name.charAt(i)+1;
				answer += up>=down? down : up;
			}
		}
		int minMove = name.length()-1;
		
		for(int i=0; i<len; i++) {
			int next = i+1;
			while(next < len && name.charAt(next)=='A')
				++next;
			minMove = Math.min(minMove, i+len-next+Math.min(i, len-next));
		}
		
		answer += minMove;
		System.out.println(answer);
	}

}
