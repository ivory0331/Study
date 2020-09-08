package StackAndQueue;

public class Q2_Gstack<E> {
	private int max; // 스택의 용량
	private int ptr; // 스택의 포인터 <- 스택에 지금 데이터가 얼마나 있는지
	private E[] stk; // 스택 본체
	
	// 실행할 때 예외：스택이 비어 있음
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	// 실행할 때 예외：스택이 가득 참
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
		}
	}

	// 생성자
	public Q2_Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max]; //배열 생성
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// push
	public E push(E x) throws OverflowGstackException {
		if(ptr>=max) throw new OverflowGstackException();
		return stk[ptr++] = x; // x값을 넣어주고 ptr의 숫자 올려줌
	}
	
	// pop
	public E pop() throws EmptyGstackException {
		if(ptr <= 0) throw new EmptyGstackException();
		return stk[--ptr]; // ptr의 숫자 내리고 데이터 보여줌
	}
	
	// peek
	public E peek() throws EmptyGstackException {
		if(ptr <= 0) throw new EmptyGstackException();
		return stk[ptr-1]; // 그냥 조회만 해줌
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
		if(ptr <= 0) System.out.println("스택이 비었습니다.");
		else {
			for(int i=0; i<ptr; i++) {
				System.out.println(stk[i]+" ");
			}
			System.out.println("");
		}
	}
	
	
	
}
