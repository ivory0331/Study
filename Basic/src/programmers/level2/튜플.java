package programmers.level2;

import java.util.*;

public class Æ©ÇÃ {

	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		String [] str = s.replaceAll("[{}]", " ").trim().split(" , ");
		int[] answer = new int[str.length];
		HashSet<Integer> hs = new HashSet<>();
		Arrays.sort(str, (a,b)->(a.length()-b.length()));
		
		int i=0;
		for(String ss : str) {
			for(String st : ss.split(",")) {
				int a = Integer.parseInt(st);
				if(!hs.contains(a)) hs.add(a);
				else continue;
				answer[i++] = a;
			}
		}
		
		for(int ans : answer)
			System.out.println(ans);
		
	}

}
