package day2;

public class _24maybeOverAvg { // ��� �̻��� �л����� �ۼ�Ƽ���� ����϶�

	public static void main(String[] args) {
		
		int in[] = {7, 100, 95, 90, 80, 70, 60, 50}; // �� ���� �л� �� 
		
		double avg = 0;
		int cnt = 0;
		
		for(int i=1; i<in.length; i++) { // ��� ���ϱ�
			avg += in[i];
		}
		avg = (double)avg/in[0]; // ���
		System.out.println(avg);
		
		for(int i=1; i<in.length; i++) {
			if(in[i]> avg) {
				cnt++;
			}
		}
		
		cnt = (int)Math.floor(cnt/(double)in[0]*100);
		System.out.println(cnt+"%");
	}

}
