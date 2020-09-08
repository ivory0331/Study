package StackAndQueue;

public class Q7_IntDeque {
	private int max; // 덱(deck)의 용량
	private int num; // 현재의 데이터 수
	private int front; // 맨 앞 커서
	private int rear; // 맨 뒤 커서
	private int[] que; // 덱(deck)의 본체

	// 실행할 때 예외：큐가 비어 있음
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	// 실행할 때 예외：큐가 가득 참
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	// 생성자
	public Q7_IntDeque(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // 덱(deck)본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다
			max = 0;
		}
	}

	// 인큐 - 머리쪽부터 데이터 넣기
	public int enqueFront(int x) throws OverflowIntDequeException{
		if(num >= num) throw new OverflowIntDequeException();
		num++;
		if(--front < 0) front = max-1; // 맨 앞이 없으면 
		que[front] = x;
		
		return x;
	}

	// 인큐 - 꼬리쪽부터 데이터 넣기
	public int enqueRear(int x) throws OverflowIntDequeException {
		if(num >= max) throw new OverflowIntDequeException();
		num++;
		que[rear++] = x;
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	// 디큐 - 머리쪽부터 데이터를 디큐
	public int dequeFront() throws EmptyIntDequeException {
		if(num <=0) throw new EmptyIntDequeException();
		num--;
		int x = que[front++];
		if(front==max) front = 0;
		
		return x;
	}
	
	// 디큐 - 꼬리쪽부터 데이터를 디큐
	public int dequeRear() throws EmptyIntDequeException {
		if(num <= 0) throw new EmptyIntDequeException();
		num--;
		if(--rear <0) {
			rear = max -1;
		}
		return que[rear];
	}
	
	
	
	
	
	
	
}
