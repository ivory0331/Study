package studygroup;

import java.util.Scanner;

public class _13458 { // 시험 감독

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] student = new int[n];
		
		for(int i=0; i<n; i++) {
			student[i] = sc.nextInt();
		}
		int b = sc.nextInt();// 총감독관
		int c = sc.nextInt();// 부감독관
		
		sc.close();
		
		long cnt = n;
		for(int i=0; i<n; i++) {
			student[i] -= b;
			
			if(student[i]>0) {
				cnt += student[i]/c;
				
				if(student[i]%c != 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
