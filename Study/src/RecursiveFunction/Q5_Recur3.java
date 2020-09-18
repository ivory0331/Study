package RecursiveFunction;

import java.util.Scanner;

public class Q5_Recur3 { // 이해못함^^;;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = scan.nextInt();
		
		recur3(n);
		scan.close();
	}

	static void recur3(int n) {
		int[] fst = new int[100];
		int[] sst = new int[100];
		int ptr = -1;
		int sw = 0;
		
		while(true) {
			if(n>0) {
				ptr++; //1
				fst[ptr] = n;
				sst[ptr] = sw;
				
				if(sw==0) n -= 1;
				else if(sw==1) {
					n -= 2;
					sw=0;
				}
				continue;
			}
			do {
				n = fst[ptr];
				sw = sst[ptr--]+1;
				
				if(sw==2) {
					System.out.println(n);
					if(ptr<0) return;
				}
			} while(sw==2);
			
		}
		
		
	}

}
