package day1;

public class _19base {

	public static void main(String[] args) {
		int n = 5; // 5��
		int m = 3; // 3��
		int res = 1;
		
		for(int i=0; i<m; i++) {
			res *= n;
		}

		System.out.println(res);
	}

}
