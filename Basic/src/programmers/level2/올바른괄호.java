package programmers.level2;

import java.util.*;

public class ¿Ã¹Ù¸¥°ýÈ£ {

	public static void main(String[] args) {
		String s = "(())()";
		boolean answer = false;
		Stack<Character> Stack = new Stack<>();
		
		if(s.charAt(0) == ')') answer = false;
		else {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == '(') 
					Stack.push(s.charAt(i));
				else {
					if(Stack.isEmpty())
						answer = false;
					else if(Stack.pop()!='(')
						answer = false;
				}	
			}
			if(Stack.isEmpty()) answer = true;
		
		}
		System.out.println(answer);
	}
}
