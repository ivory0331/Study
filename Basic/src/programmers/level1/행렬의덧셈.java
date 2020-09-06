package programmers.level1;

public class Çà·ÄÀÇµ¡¼À {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] += arr1[i][j];
            }
        }
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        
        for(int i=0; i<answer.length; i++) {
        	for(int j=0; j<answer.length; j++) {
        		System.out.print(answer[i][j]+" ");
        	}
        	System.out.println(" ");
        }
        

	}

}
