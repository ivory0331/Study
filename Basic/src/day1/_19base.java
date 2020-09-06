package day1;

public class _19base {

	public static void main(String[] args) {
		int n = 5; // 5ÀÇ
		int m = 3; // 3½Â
		int res = 1;
		
		for(int i=0; i<m; i++) {
			res *= n;
		}

		System.out.println(res);
	}

}
