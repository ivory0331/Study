package programmers.level1;

public class 키패드누르기 {

	public static void main(String[] args) {
		int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		String hand = "right";
		
		String answer = "";
		int left = 10; // *으로 시작
		int right = 12; // #으로 시작
        for(int i : numbers) {
        	if(i==1||i==4||i==7) { // 무조건 왼손
        		answer += "L"; 
        		left = i; //1 4
        	}
        	else if(i==3||i==6||i==9) { // 무조건 오른손
        		answer += "R";
        		right = i; //3
        	}
        	else { // i = 2,5,8,0 인 경우
        		if(distance(i,left)<distance(i,right)) {// 왼손이 더 가까운 경우
        			answer += "L";
        			left = i;
        		}else if(distance(i,left)>distance(i,right)) {// 오른손이 더 가까운 경우
        			answer += "R";
        			right = i;
        		}else {// 왼손 오른손 거리 같은 경우
        			if(hand.equals("left")) {// 오른손잡이라면
        				answer += "L";
            			left = i;
        			}else {// 왼손잡이 라면
        				answer += "R";
            			right = i;
        			}
        		}
        	}
        }
        
        System.out.println(answer);
	}

	private static int distance(int i, int handLoca) {
		int distance = 0;
		int n = 0;
		
		if(i==0) { // 0이면 12로 간주한다(위치 때문에)
			i=11;
		}
		if(handLoca==0) {
			handLoca=11;
		}
		
		n = Math.abs(handLoca-i); // 1 2
		
		if(n%3==0) distance = n/3;
		else distance = (n+1)/3+1; // 1 2
		return distance;
	}


}
