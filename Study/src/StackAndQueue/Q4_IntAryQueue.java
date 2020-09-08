package StackAndQueue;

public class Q4_IntAryQueue {
	private int max; // 큐의 용량(최대 몇개까지)
	private int num; // 큐에 있는 현재 데이터 수
	private int[] que; // 큐 본체
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	public Q4_IntAryQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// enqueue 데이터 넣기
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=max) throw new OverflowIntQueueException();
		que[num++] = x;
		return x;
	}
	
	// dequeue 데이터를 꺼내기
	public int deque() throws EmptyIntQueueException{
		if(num <= 0) throw new EmptyIntQueueException();
		int x = que[0];
		for(int i=0; i<num-1; i++) {
			que[i] = que[i+1];
		}
		num--;
		return x;
	}
	
	// peek 맨 끝 데이터 보기
	public int peek() throws EmptyIntQueueException{
		if(num <= 0) throw new EmptyIntQueueException();
		return que[num-1];
	}
	
	// indexOf
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			if(que[i]==x) {
				return i;
			}
		}
		return -1; // 데이터가 일치하는 것이 없는 경우
	}
	
	// clear
	public void clear() {
		num = 0;
	}
	
	// capacity 용량
	public int capacity() {
		return max;
	}
	
	// size
	public int size() {
		return num;
	}

	// isEmpty
	public boolean isEmpty() {
		return num <= 0;
	}

	// isFull
	public boolean isFull() {
		return num >= max;
	}

	// dump
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
}
