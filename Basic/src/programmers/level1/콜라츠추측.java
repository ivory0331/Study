package programmers.level1;

public class �ݶ������� {

	public static void main(String[] args) {
		long num = 6;
		
		int answer = 0;
        while(num != 1){
            if(num%2==0){// ¦�����
                num/=2; 
            }else{// Ȧ�����
                num = num*3+1;
            }
            answer++;
            if(answer==500){
                answer = -1;
                break;
            }
        }
        System.out.println(answer);

	}

}
