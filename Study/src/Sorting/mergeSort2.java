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
		// 배열, 임시저장배열, 시작index, 끝index 를 넘겨줌 
	}

	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			mergeSort(arr, tmp, start, mid); // 배열 앞부분
			mergeSort(arr, tmp, mid+1, end); // 배열 뒷부분
			merge(arr, tmp, start, mid, end); // 두개로 나뉜것 병합
		}
		
	}

	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		for(int i=start; i<=end; i++) {
			tmp[i] = arr[i];
		}
		int part1 = start; // 배열1의 앞부분
		int part2 = mid+1; // 배열2의 앞부분
		int index = start; // 원본 배열의 인덱스
		
		while(part1<=mid && part2<=end) { // 각각 배열의 끝까지 갈 때까지
			if(tmp[part1]<=tmp[part2]) { // 배열1이 배열2보다 작다면
				arr[index] = tmp[part1];
				part1++;
			} else { // 배열2가 배열1보다 작다면
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		for(int i=0; i<=mid-part1; i++) { // 배열1에서 남은 나머지는
			arr[index+i] = tmp[part1+i];
		}
	}

}
