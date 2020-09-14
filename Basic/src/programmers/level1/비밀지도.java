package programmers.level1;

public class 비밀지도 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		String[] answer = new String[n];
		
		for(int i=0; i<n; i++) {
			String line = Integer.toBinaryString(arr1[i]|arr2[i]); // 또는을 이용하여 겹치는 부분은 모두 1로 표시
			line = String.format("%"+n+"s", line); // 자리수 맞춰줌
			line = line.replaceAll("1", "#");
			line = line.replaceAll("0", " ");
			answer[i] = line;
		}
		
		for(String ans : answer) {
			System.out.println(ans);
		}
	}

}
