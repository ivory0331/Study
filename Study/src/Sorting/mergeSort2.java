package Sorting;

public class mergeSort2 {

	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		mergeSort(arr);
		
		for(int ans : arr)
			System.out.print(ans+" ");
	}

	private static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length];
		mergeSort(arr, tmp, 0, arr.length-1);
		// �迭, �ӽ�����迭, ����index, ��index �� �Ѱ��� 
	}

	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			mergeSort(arr, tmp, start, mid); // �迭 �պκ�
			mergeSort(arr, tmp, mid+1, end); // �迭 �޺κ�
			merge(arr, tmp, start, mid, end); // �ΰ��� ������ ����
		}
		
	}

	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		for(int i=start; i<=end; i++) {
			tmp[i] = arr[i];
		}
		int part1 = start; // �迭1�� �պκ�
		int part2 = mid+1; // �迭2�� �պκ�
		int index = start; // ���� �迭�� �ε���
		
		while(part1<=mid && part2<=end) { // ���� �迭�� ������ �� ������
			if(tmp[part1]<=tmp[part2]) { // �迭1�� �迭2���� �۴ٸ�
				arr[index] = tmp[part1];
				part1++;
			} else { // �迭2�� �迭1���� �۴ٸ�
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		for(int i=0; i<=mid-part1; i++) { // �迭1���� ���� ��������
			arr[index+i] = tmp[part1+i];
		}
	}

}
