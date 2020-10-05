package studygroup;

import java.util.Scanner;

public class _11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] wallet = new int[N];
		int cnt = 0;
		for(int i=0; i<N; i++) {
			wallet[i] = sc.nextInt();
		}
		sc.close();
		for(int i=N-1; i>=0; i--) {
			if(K/wallet[i]==0) continue;
			else {
				cnt+= K/wallet[i];
				K = K%wallet[i];
			}
		}
		System.out.println(cnt);
	}

}
