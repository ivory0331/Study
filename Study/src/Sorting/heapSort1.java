package Sorting;

public class heapSort1 {

	public static void main(String[] args) {
		int[] arr = {22,5,11,32,120,68,70};
		
		heapSort(arr);
		
		for(int ans : arr)
			System.out.print(ans+" ");
	}

	private static void heapSort(int[] arr) {
		int n = arr.length;
		for(int i=(n-1)/2; i>=0; i--) { // a[i]~a[n-1] ������ �����
			downHeap(arr,i,n-1);
		}
		for(int i=n-1; i>0; i--) {
			swap(arr, 0, i);
			downHeap(arr,0,i-1);
		}
		
	}

	private static void swap(int[] arr, int i, int i2) {
		int t = arr[i];
		arr[i] = arr[i2];
		arr[i2] = t;
	}

	private static void downHeap(int[] arr, int left, int right) {
		int temp = arr[left]; // ��Ʈ
		int child; // ū ���� ���� ���
		int parent; // �θ�
		
		for(parent=left; parent<(right+1)/2; parent = child) {
			int lc = parent*2+1; // ���� �ڽ�
			int rc = lc+1; // ������ �ڽ�
			child = (rc<=right && arr[rc]>arr[lc])? rc :lc; // ū ���� ���� ��带 �ڽĿ� ����
			
			if(temp >= arr[child]) break;
			arr[parent] = arr[child];
		}
		arr[parent] = temp;
	}

}
