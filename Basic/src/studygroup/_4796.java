package studygroup;

import java.util.Scanner;

public class _4796 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = 1;
		do {
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
			if(L==0 && P==0 && V==0) break;
			int n = V/P;
			V -= n*P;
			int answer = Math.min(L, V)+(n*L);
			System.out.println("Case "+idx+": "+answer);
			idx++;
			
		} while (sc.hasNext());
		
	}

}
