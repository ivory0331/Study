package programmers.level1;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		String s = "try hello world";
		
		String answer = "";
		String[] arr = s.split(""); // t r y  h e l l o  w o r l d
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(" ")) {
				cnt = 0; // 띄어쓰기마다 초기화
			}else {
				if(cnt%2==0) { // 홀수 대문자
					arr[i] = arr[i].toUpperCase();
					cnt++;
				}else { // 짝수 소문자
					arr[i] = arr[i].toLowerCase();
					cnt++;
				}
			}
			answer += arr[i]; // 정답에 넣어주기
		}
		
        System.out.println(answer);

	}

}
