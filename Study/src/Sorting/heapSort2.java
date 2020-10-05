package Sorting;

public class heapSort2 {

	public static void main(String[] args) {
		int[] data = {4,53,77,65,36,45,88,61,8,24};

		heap(data, data.length); // 88 65 77 61 36 45 53 4 8 24 ��Ʈ
		// ���� ū ���ڸ� ��Ʈ�� ���� ������ ���·� ����� ���� �ϴ� �ѹ� ����
		
		for(int i=data.length-1; i>0; i--) { // ���� ū ���ڸ� �� ����������
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			
			heap(data, i); // �� ������ ���ĵȰ� �����ϰ� �ٽ� ����
		}
		for(int ans: data)
			System.out.print(ans+" ");
	}

	static void heap(int[] data, int n) {
		for(int i=1; i<n; i++) {
			int child = i;
			while(child>0) { // �ڽ��� 0�̻��϶����� �ݺ�
				int parent = (child-1)/2; // �ڽ����� �θ� �� ���ϱ�
				if(data[child]>data[parent]) { // �θ𺸴� �ڽ��� ũ�� swap
					int temp = data[parent];
					data[parent] = data[child];
					data[child] = temp;
				}
				child = parent;
			}
		}
	}

}
