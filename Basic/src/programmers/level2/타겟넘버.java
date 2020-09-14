package programmers.level2;

public class Ÿ�ٳѹ� { // DFS �� BFS �����ϰ� �ٽ� Ǯ��...
	static int answer = 0;
	
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		
		DFS(target, numbers, 0);
		System.out.println(answer);
	}

	public static void DFS(int target, int[] numbers, int index) {
		if(index == numbers.length) { // ����Լ� ���ߴ� �극��ũ
			int sum = 0;
			for(int num : numbers) {
				sum += num;
			}
			if(sum == target) {
				answer++;
			}
		} else {
			numbers[index] *= 1; // ����� ���
			DFS(target, numbers, index+1);
			
			numbers[index] *= -1; // ������ ���
			DFS(target, numbers, index+1);
		}
	}
}
