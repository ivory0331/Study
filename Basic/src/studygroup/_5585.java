package studygroup;

import java.util.Scanner;

public class _5585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = 1000-sc.nextInt(); // 620
		sc.close();
		int don[] = {500,100,50,10,5,1};
		int cnt = 0;
		int answer = 0;
		while(e>0) {
			if(e/don[cnt]!=0) {
				answer += e/don[cnt];
				e = e%don[cnt];	
			}
			cnt++;
		}
		System.out.println(answer);
	}
}
