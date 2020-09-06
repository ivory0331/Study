package programmers.level1;

public class Ű�е崩���� {

	public static void main(String[] args) {
		int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		String hand = "right";
		
		String answer = "";
		int left = 10; // *���� ����
		int right = 12; // #���� ����
        for(int i : numbers) {
        	if(i==1||i==4||i==7) { // ������ �޼�
        		answer += "L"; 
        		left = i; //1 4
        	}
        	else if(i==3||i==6||i==9) { // ������ ������
        		answer += "R";
        		right = i; //3
        	}
        	else { // i = 2,5,8,0 �� ���
        		if(distance(i,left)<distance(i,right)) {// �޼��� �� ����� ���
        			answer += "L";
        			left = i;
        		}else if(distance(i,left)>distance(i,right)) {// �������� �� ����� ���
        			answer += "R";
        			right = i;
        		}else {// �޼� ������ �Ÿ� ���� ���
        			if(hand.equals("left")) {// ���������̶��
        				answer += "L";
            			left = i;
        			}else {// �޼����� ���
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
		
		if(i==0) { // 0�̸� 12�� �����Ѵ�(��ġ ������)
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
