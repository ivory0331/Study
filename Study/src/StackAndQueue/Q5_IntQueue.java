package StackAndQueue;

public class Q5_IntQueue {

	private int max; // ť �뷮
	private int front; // �� �� Ŀ��
	private int rear; // �� �� Ŀ��
	private int num; // ������ ������ ��
	private int[] que; // ť�� ��ü

	// ������ �� ���ܣ�ť�� ��� ����
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// ������ �� ���ܣ�ť�� ���� ��
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
	
	// �����͸� �ִ� ��
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= max) throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == max) rear=0;
		
		return x;
	}
	
	// �����͸� ���� ���� ��
	public int deque() throws EmptyIntQueueException {
		if(num <=0) throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front==max) front =0;
		
		return x;
	}
	
	// �� �����͸� ���캸�� ��
	public int peek() throws EmptyIntQueueException {
		if(num <=0) throw new EmptyIntQueueException();
		return que[front];
	}
	
	// �˻�
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i+front)%max;
			if(que[idx]==x) {
				return idx;
			}
		}
		return -1;
	}
	
	// ť �ȿ��� ���°�� �ִ��� ��ȯ�ϱ�
	public int search(int x) {
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max]==x) {
				return i+1;
			}
		}
		return 0;
	}
	
	// ť�� ���
	public void clear() {
		num = front = rear = 0;
	}

	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ť�� ���� ������ ���� ��ȯ
	public int size() {
		return num;
	}

	// ť�� ��� �ִ°�?
	public boolean isEmpty() {
		return num <= 0;
	}

	// ť�� ���� á�°�?
	public boolean isFull() {
		return num >= max;
	}

	// ť ���� ��(���͸� �Ӹ��沿���� ���ʷ� ��Ÿ��
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ������ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
	
}