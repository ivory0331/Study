package studygroup;

import java.util.Scanner;

public class _2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // º≥≈¡ kg // 18
		int cnt = 0;
		
		while(true) {
			if(n%5==0) {
				System.out.println(n/5+cnt);
				break;
			} else if(n<=0) {
				System.out.println(-1);
				break;
			}
			n = n-3;
			cnt++;
		}
		scan.close();
	}

}
