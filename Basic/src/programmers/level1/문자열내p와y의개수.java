package programmers.level1;

public class ���ڿ���p��y�ǰ��� {

	public static void main(String[] args) {
		String s = "pPoooyY";
		
		boolean answer = true;
        int pNum=0, yNum=0;
		s = s.toLowerCase(); // ppoooyy
		char[] sArr = new char[s.length()];
		sArr = s.toCharArray();
		for(char i : sArr) {
			if('p'==i) pNum++;
			else if('y'==i) yNum++;
		}
		if(yNum!=pNum) answer = false;
        
        System.out.println(answer);

	}

}
