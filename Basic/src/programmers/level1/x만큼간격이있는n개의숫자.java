package programmers.level1;

public class x��ŭ�������ִ�n���Ǽ��� {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		
		long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i] = x*(i+1); // answer�� longŸ���̹Ƿ� x�� longŸ���̾�� ��
        }

        for(long ans : answer) {
        	System.out.print(ans+" ");
        }

	}

}
