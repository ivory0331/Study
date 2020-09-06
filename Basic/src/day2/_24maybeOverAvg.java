package day2;

public class _24maybeOverAvg { // 평균 이상인 학생들의 퍼센티지를 출력하라

	public static void main(String[] args) {
		
		int in[] = {7, 100, 95, 90, 80, 70, 60, 50}; // 맨 앞은 학생 수 
		
		double avg = 0;
		int cnt = 0;
		
		for(int i=1; i<in.length; i++) { // 평균 구하기
			avg += in[i];
		}
		avg = (double)avg/in[0]; // 평균
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
