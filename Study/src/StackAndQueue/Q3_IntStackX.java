package StackAndQueue;

public class Q3_IntStackX {
	private int max; // �뷮 (A,B �հ�)
	private int ptrA; // A�� ������
	private int ptrB; // B�� ������
	private int[] stk; // ���� ��ü
	
	public enum AorB { // enum <- ����..?
		StackA, StackB
	}

	// ������ �� ���ܣ������� ��� ����
	public class EmptyIntStackX2Exception extends RuntimeException {
		public EmptyIntStackX2Exception() {
		}
	}

	// ������ �� ���ܣ������� ���� ��
	public class OverflowIntStackX2Exception extends RuntimeException {
		public OverflowIntStackX2Exception() {
		}
	}
	
	public Q3_IntStackX(int capacity) {
		ptrA = 0;
		ptrB = capacity -1;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// push
	public int push(AorB sw, int x) throws OverflowIntStackX2Exception{
		if(ptrA >= ptrB+1) {
			throw new OverflowIntStackX2Exception();
		}
		
		switch (sw) {
		case StackA:
			stk[ptrA++] = x;
			break;
			
		case StackB:
			stk[ptrB--] = x;
			break;
		}
		return x;
	}
	
	// pop
	public int pop(AorB sw) throws EmptyIntStackX2Exception{
		int x=0;
		switch (sw) {
		case StackA:
			if(ptrA <=0) throw new EmptyIntStackX2Exception();
			x = stk[--ptrA];
			break;
			
		case StackB:
			if(ptrB <=0) throw new EmptyIntStackX2Exception();
			x = stk[++ptrB];
			break;
		}
		return x;
	}
	
	// peek
	public int peek(AorB sw) throws EmptyIntStackX2Exception{
		int x=0;
		switch (sw) {
		case StackA:
			if(ptrA <=0) throw new EmptyIntStackX2Exception();
			x = stk[ptrA-1];
			break;
			
		case StackB:
			if(ptrB <=0) throw new EmptyIntStackX2Exception();
			x = stk[ptrB+1];
			break;
		}
		return x;
	}
	
	// indexOf
	public int indexOf(AorB sw, int x) {
		switch (sw) {
		case StackA:
			for(int i=ptrA-1; i>=0; i--) {
				if(stk[i]==x) return i;
			}
			break;
			
		case StackB:
			for(int i=ptrB+1; i< max; i++) {
				if(stk[i]==x) return i;
			}
			break;
		}
		return -1; // �˻� ������ ��� -1�� ��ȯ
	}
	
	// clear
	public void clear(AorB sw) {
		switch (sw) {
		case StackA:
			ptrA = 0;
			break;
		case StackB:
			ptrB = max-1;
			break;
		}
	}
	
	// capacity
	public int capacity() {
		return max;
	}
	
	// size
	public int size(AorB sw) {
		switch (sw) {
		case StackA:
			return ptrA;
		case StackB:
			return max-ptrB-1;
		}
		return 0;
	}
	
	// isEmpty
	public boolean isEmpty(AorB sw) {
		switch (sw) {
		case StackA:
			return ptrA <= 0;
		case StackB:
			return ptrB >= max-1;
		}
		return true;
	}
	
	// isFull
	public boolean isFull() {
		return ptrA >= ptrB +1;
	}
	
	// dump
	public void dump(AorB sw) {
		switch (sw) {
		case StackA:
			if(ptrA <=0) System.out.println("������ ������ϴ�.");
			else {
				for(int i=0; i<ptrA; i++) {
					System.out.print(stk[i]+" ");
				}
				System.out.println("");
			}
			break;
		case StackB:
			if(ptrB >= max-1) System.out.println("������ ������ϴ�.");
			else {
				for(int i=max-1; i>ptrB; i--) {
					System.out.print(stk[i]+" ");
				}
				System.out.println("");
			}
			break;
		}
	}
}
