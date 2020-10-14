package studygroup;

import java.util.*;

public class _11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int[] tmp = new int[N];
		int sum = 0;
		
		for(int i=0; i<N; i++)
			P[i] = sc.nextInt();

		Arrays.sort(P);
		tmp[0] = P[0];
		for(int i=1; i<N; i++) {
			tmp[i] = P[i]+tmp[i-1];
		}
		
		for(int t : tmp) {
			sum += t;
		}
		System.out.println(sum);
	}

}
