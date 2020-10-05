package Sorting;

public class heapSort2 {

	public static void main(String[] args) {
		int[] data = {4,53,77,65,36,45,88,61,8,24};

		heap(data, data.length); // 88 65 77 61 36 45 53 4 8 24 루트
		// 가장 큰 숫자를 루트에 놓은 힙정렬 상태로 만들기 위해 일단 한번 실행
		
		for(int i=data.length-1; i>0; i--) { // 가장 큰 숫자를 맨 마지막으로
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			
			heap(data, i); // 맨 마지막 정렬된것 제외하고 다시 정렬
		}
		for(int ans: data)
			System.out.print(ans+" ");
	}

	static void heap(int[] data, int n) {
		for(int i=1; i<n; i++) {
			int child = i;
			while(child>0) { // 자식이 0이상일때까지 반복
				int parent = (child-1)/2; // 자식으로 부모 값 구하기
				if(data[child]>data[parent]) { // 부모보다 자식이 크면 swap
					int temp = data[parent];
					data[parent] = data[child];
					data[child] = temp;
				}
				child = parent;
			}
		}
	}

}
