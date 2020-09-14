package programmers.level2;

public class 타겟넘버 { // DFS 랑 BFS 공부하고 다시 풀기...
	static int answer = 0;
	
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		
		DFS(target, numbers, 0);
		System.out.println(answer);
	}

	public static void DFS(int target, int[] numbers, int index) {
		if(index == numbers.length) { // 재귀함수 멈추는 브레이크
			int sum = 0;
			for(int num : numbers) {
				sum += num;
			}
			if(sum == target) {
				answer++;
			}
		} else {
			numbers[index] *= 1; // 양수의 경우
			DFS(target, numbers, index+1);
			
			numbers[index] *= -1; // 음수의 경우
			DFS(target, numbers, index+1);
		}
	}
}
