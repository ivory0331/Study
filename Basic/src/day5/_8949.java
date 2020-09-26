package day5;

import java.util.Scanner;

public class _8949 { // 대충 더해

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "";
		int sum=0;
		String A = scan.next();
		String B = scan.next();
		
		if(A.length()>B.length()) {
			for(int i=0; i<=A.length()-B.length(); i++) B = "0"+B;
		}else if(A.length()<B.length()) {
			for(int i=0; i<=B.length()-A.length(); i++) A = "0"+A;
		}
		scan.close();		
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
			
		for(int i=0; i<a.length; i++) {
			sum = (a[i]-'0')+(b[i]-'0');
			answer += String.valueOf(sum);
		}
		
		System.out.println(answer);
	}
}
