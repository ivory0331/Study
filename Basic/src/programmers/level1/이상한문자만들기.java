package programmers.level1;

public class �̻��ѹ��ڸ���� {

	public static void main(String[] args) {
		String s = "try hello world";
		
		String answer = "";
		String[] arr = s.split(""); // t r y  h e l l o  w o r l d
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(" ")) {
				cnt = 0; // ���⸶�� �ʱ�ȭ
			}else {
				if(cnt%2==0) { // Ȧ�� �빮��
					arr[i] = arr[i].toUpperCase();
					cnt++;
				}else { // ¦�� �ҹ���
					arr[i] = arr[i].toLowerCase();
					cnt++;
				}
			}
			answer += arr[i]; // ���信 �־��ֱ�
		}
		
        System.out.println(answer);

	}

}
