package programmers.level1;

import java.util.*;

public class ü���� {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		
        int answer = n-lost.length; // �ϴ� �Ҿ�����ֵ� ���� / 5-2 =3
        Arrays.sort(lost);
        Arrays.sort(reserve);
		// �Ҿ�����ְ� ������ �־����� Ȯ��
		for(int l : lost) { //2 4
			for(int r : reserve) { //3
				if(r==l) {
					l = -1;
					r = -1;
					answer++; // �Ҿ�������� ������ �ִ� ģ���̹Ƿ�
                    break;
				}
			}
		}
		for(int l : lost) { // 2 4
			for(int r : reserve) { // 3
				if(l==r+1 || l==r-1){
					r = -1;
					answer++;
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
