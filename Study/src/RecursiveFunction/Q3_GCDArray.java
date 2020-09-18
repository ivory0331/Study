package RecursiveFunction;

import java.util.Scanner;

public class Q3_GCDArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �� ���� �ִ� ������� ���ұ��? :");
		int n;
		do {
			n = scan.nextInt();
		} while (n <= 1);
		
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			x[i] = scan.nextInt();
		}
		
		System.out.println("�ִ� ������� "+gcdArray(x,0,n)+" �Դϴ�.");
		
	}

	public static int gcdArray(int[] x, int start, int n) {
		if(n==1) 
			return x[start];
		else if(n==2) 
			return gcd(x[start], x[start+1]);
		else
			return gcd(x[start],gcdArray(x,start+1,n-1));	
	}

	public static int gcd(int x, int y) {
		while(y!=0) {
			int temp = y;
			y = x%y;
			x = temp;
		}
		return x;
	}

}
