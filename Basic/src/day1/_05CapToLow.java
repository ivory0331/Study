package day1;

public class _05CapToLow { //�빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ�

	public static void main(String[] args) {
		
		String input = "helloworLD";
		char []arr;
		arr = input.toCharArray(); // ���ڿ� �ϳ��ϳ��� ��ü�� ��ȯ������
		
		System.out.println(arr);
		
		for(int i=0; i<arr.length; i++) {
			if('a' <= arr[i] && arr[i] <= 'z') { // �ҹ����� ���
				arr[i] = (char)(arr[i] + ('A'-'a'));
			}
			else if('A' <= arr[i] && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A'-'a'));
			}
		}
		
		System.out.println(arr);

	}

}
