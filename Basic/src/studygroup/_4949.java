package studygroup;

import java.util.*;

public class _4949 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> basket = new Stack<>();
		String answer = "";
		do {
			basket.clear();
			answer = "yes";
			String line = scan.nextLine();
			if(".".equals(line)) break;
			line = line.replaceAll("[A-Z||a-z||\\s]", "");
			line = line.replaceAll("\\.", ""); //([]())
			
			if(line.length()==0) answer="yes";
			else {
				if(line.charAt(0)==')' || line.charAt(0)==']') {
					answer = "no";
				} else {
					for(char c : line.toCharArray()) {
						if(basket.isEmpty()) basket.push(c);
						
						else if(c==')') {
							if(basket.peek()=='(') basket.pop();
							else basket.push(c);
							
						} else if(c==']'){
							if(basket.peek()=='[') basket.pop();
							else basket.push(c);
							
						} else basket.push(c);
					}
				}
			}
			if(!basket.isEmpty()) answer="no";
			
			System.out.println(answer);
			
		} while (scan.hasNext());
		
		scan.close();
		
	}

}
