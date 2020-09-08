package StackAndQueue;

public class Q5_IntQueue {

	private int max; // 큐 용량
	private int front; // 맨 앞 커서
	private int rear; // 맨 뒤 커서
	private int num; // 현재의 데이터 수
	private int[] que; // 큐의 본체

	// 실행할 때 예외：큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// 실행할 때 예외：큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}
	
	public Q5_IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 데이터를 넣는 것
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= max) throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == max) rear=0;
		
		return x;
	}
	
	// 데이터를 빼서 보는 것
	public int deque() throws EmptyIntQueueException {
		if(num <=0) throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front==max) front =0;
		
		return x;
	}
	
	// 앞 데이터를 살펴보는 것
	public int peek() throws EmptyIntQueueException {
		if(num <=0) throw new EmptyIntQueueException();
		return que[front];
	}
	
	// 검색
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i+front)%max;
			if(que[idx]==x) {
				return idx;
			}
		}
		return -1;
	}
	
	// 큐 안에서 몇번째에 있는지 반환하기
	public int search(int x) {
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max]==x) {
				return i+1;
			}
		}
		return 0;
	}
	
	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓인 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있는가?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼는가?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 터(이터를 머리→꼬리의 차례로 나타냄
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
	
}
