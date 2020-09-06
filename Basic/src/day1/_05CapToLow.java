package day1;

public class _05CapToLow { //대문자는 소문자로 소문자는 대문자로

	public static void main(String[] args) {
		
		String input = "helloworLD";
		char []arr;
		arr = input.toCharArray(); // 문자열 하나하나를 객체로 변환시켜줌
		
		System.out.println(arr);
		
		for(int i=0; i<arr.length; i++) {
			if('a' <= arr[i] && arr[i] <= 'z') { // 소문자의 경우
				arr[i] = (char)(arr[i] + ('A'-'a'));
			}
			else if('A' <= arr[i] && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A'-'a'));
			}
		}
		
		System.out.println(arr);

	}

}
