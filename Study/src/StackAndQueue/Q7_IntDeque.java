package StackAndQueue;

public class Q7_IntDeque {
	private int max; // ��(deck)�� �뷮
	private int num; // ������ ������ ��
	private int front; // �� �� Ŀ��
	private int rear; // �� �� Ŀ��
	private int[] que; // ��(deck)�� ��ü

	// ������ �� ���ܣ�ť�� ��� ����
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}

	// ������ �� ���ܣ�ť�� ���� ��
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	// ������
	public Q7_IntDeque(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // ��(deck)��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� �����ϴ�
			max = 0;
		}
	}

	// ��ť - �Ӹ��ʺ��� ������ �ֱ�
	public int enqueFront(int x) throws OverflowIntDequeException{
		if(num >= num) throw new OverflowIntDequeException();
		num++;
		if(--front < 0) front = max-1; // �� ���� ������ 
		que[front] = x;
		
		return x;
	}

	// ��ť - �����ʺ��� ������ �ֱ�
	public int enqueRear(int x) throws OverflowIntDequeException {
		if(num >= max) throw new OverflowIntDequeException();
		num++;
		que[rear++] = x;
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	// ��ť - �Ӹ��ʺ��� �����͸� ��ť
	public int dequeFront() throws EmptyIntDequeException {
		if(num <=0) throw new EmptyIntDequeException();
		num--;
		int x = que[front++];
		if(front==max) front = 0;
		
		return x;
	}
	
	// ��ť - �����ʺ��� �����͸� ��ť
	public int dequeRear() throws EmptyIntDequeException {
		if(num <= 0) throw new EmptyIntDequeException();
		num--;
		if(--rear <0) {
			rear = max -1;
		}
		return que[rear];
	}
	
	
	
	
	
	
	
}
