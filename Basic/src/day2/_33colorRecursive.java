package day2;

public class _33colorRecursive { // 0을 2로 색칠하기(재귀함수를 이용하여)

	static final int size = 5;
	static final int color = 2;
	
	static int [][]map =
		{{0,0,0,0,0},
		{0,0,1,1,0},
		{0,0,0,0,1},
		{0,0,0,0,0},
		{0,0,1,0,0}
		};
	
	public static void color(int x, int y) {
		
		if(map[x][y] != 1) // 0이라면 2로 변경
			map[x][y] = color;
		
		if(x-1 >=0 && map[x-1][y] != color && map[x-1][y] != 1) // 
			color(x-1,y);
		if(x+1 <= size && map[x+1][y] != color && map[x+1][y] != 1)
			color(x+1,y);
		if(y-1 >=0 && map[x][y-1] != color && map[x][y-1] != 1)
			color(x,y-1);
		if(y+1 >=size && map[x][y+1] != color && map[x][y+1] != 1)
			color(x,y+1);
	}
	
	public static void main(String[] args) {
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		color(0,0);
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

	}

}
