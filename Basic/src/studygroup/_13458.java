package studygroup;

import java.util.Scanner;

public class _13458 { // ���� ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] student = new int[n];
		
		for(int i=0; i<n; i++) {
			student[i] = sc.nextInt();
		}
		int b = sc.nextInt();// �Ѱ�����
		int c = sc.nextInt();// �ΰ�����
		
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
