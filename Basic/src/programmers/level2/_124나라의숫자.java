package programmers.level2;

public class _124�����Ǽ��� {

	public static void main(String[] args) {
		int n = 513;
		String answer = "";
		
		int addNum = 0; 
		
		while(n != 0) { 
			addNum = n%3 == 0 ? 4 : n%3; 
			answer = Integer.toString(addNum) + answer; 
			n = addNum == 4 ? n/3 - 1 : n/3; 
		}
		System.out.println(answer);

	}

}
