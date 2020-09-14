package programmers.level1;

import java.util.*;

class Fail {
    int stage;
    double rate;
    Fail(int stage, double rate){
        this.stage = stage;
        this.rate = rate;
    }
}

public class ������ {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		
		int[] a = solution(N, stages);
		
		for(int ans: a) {
			System.out.print(ans+" ");
		}
	}

	
    static Comparator<Fail> comp = new Comparator<Fail>(){
        public int compare(Fail a, Fail b){
            if(a.rate < b.rate) return 1;
            else if(a.rate>b.rate) return -1;
            else {
                if(a.stage > b.stage) return 1;
                else if(a.stage < b.stage) return -1;
                else return 0;
            }
        }
    };
    
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Fail> fails = new ArrayList<Fail>();
        int total = stages.length;
        
        int[] users = new int[N+1];
        for(int s : stages){ // ���������� ����� ��
            users[s-1]++; // ��������1�� �ε�����ȣ0�� �־���
        }
        for(int i=0; i<N; i++){
            if(users[i]==0) fails.add(new Fail(i+1,0)); // ����ڰ� ���� ��� ���������� 0�̴�.
            else {
                fails.add(new Fail(i+1, (double)users[i]/total)); // ���� ��/��ü �����
                total -= users[i]; // ��ü ����� �� �̹� ����� ����� ���ش�.
            }
        }
        Collections.sort(fails, comp); // �������� ���� ������������ �������� ����
        
        for(int i=0; i<N; i++){
            answer[i] = fails.get(i).stage;
        }
        
        return answer;
    }
}
