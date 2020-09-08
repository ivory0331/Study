package StackAndQueue;

public class Q2_Gstack<E> {
	private int max; // ������ �뷮
	private int ptr; // ������ ������ <- ���ÿ� ���� �����Ͱ� �󸶳� �ִ���
	private E[] stk; // ���� ��ü
	
	// ������ �� ���ܣ������� ��� ����
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	// ������ �� ���ܣ������� ���� ��
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
		}
	}

	// ������
	public Q2_Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max]; //�迭 ����
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// push
	public E push(E x) throws OverflowGstackException {
		if(ptr>=max) throw new OverflowGstackException();
		return stk[ptr++] = x; // x���� �־��ְ� ptr�� ���� �÷���
	}
	
	// pop
	public E pop() throws EmptyGstackException {
		if(ptr <= 0) throw new EmptyGstackException();
		return stk[--ptr]; // ptr�� ���� ������ ������ ������
	}
	
	// peek
	public E peek() throws EmptyGstackException {
		if(ptr <= 0) throw new EmptyGstackException();
		return stk[ptr-1]; // �׳� ��ȸ�� ����
	}
	
	// indexOf
	public int indexOf(E x) {
		for(int i=ptr-1; i>=0; i--) {
			if("x".equals(stk[i])) {
				return i;
			}
		}
		return -1;
	}
	
	// clear
	public void clear() {
		ptr = 0;
	}
	
	// capacity
	public int capacity() {
		return max;
	}
	
	// size
	public int size() {
		return ptr;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// isFull
	public boolean isFull() {
		return ptr >= max;
	}
	
	// dump
	public void dump() {
		if(ptr <= 0) System.out.println("������ ������ϴ�.");
		else {
			for(int i=0; i<ptr; i++) {
				System.out.println(stk[i]+" ");
			}
			System.out.println("");
		}
	}
	
	
	
}
