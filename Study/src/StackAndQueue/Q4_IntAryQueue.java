package StackAndQueue;

public class Q4_IntAryQueue {
	private int max; // ť�� �뷮(�ִ� �����)
	private int num; // ť�� �ִ� ���� ������ ��
	private int[] que; // ť ��ü
	
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
	
	// enqueue ������ �ֱ�
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=max) throw new OverflowIntQueueException();
		que[num++] = x;
		return x;
	}
	
	// dequeue �����͸� ������
	public int deque() throws EmptyIntQueueException{
		if(num <= 0) throw new EmptyIntQueueException();
		int x = que[0];
		for(int i=0; i<num-1; i++) {
			que[i] = que[i+1];
		}
		num--;
		return x;
	}
	
	// peek �� �� ������ ����
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
		return -1; // �����Ͱ� ��ġ�ϴ� ���� ���� ���
	}
	
	// clear
	public void clear() {
		num = 0;
	}
	
	// capacity �뷮
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
			System.out.println("ť�� ������ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
}
