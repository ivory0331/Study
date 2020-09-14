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

public class 실패율 {

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
        for(int s : stages){ // 스테이지별 사용자 수
            users[s-1]++; // 스테이지1은 인덱스번호0에 넣어줌
        }
        for(int i=0; i<N; i++){
            if(users[i]==0) fails.add(new Fail(i+1,0)); // 사용자가 없는 경우 실패율또한 0이다.
            else {
                fails.add(new Fail(i+1, (double)users[i]/total)); // 유저 수/전체 사용자
                total -= users[i]; // 전체 사용자 중 이미 계산한 사람을 빼준다.
            }
        }
        Collections.sort(fails, comp); // 실패율이 높은 스테이지부터 내림차순 정렬
        
        for(int i=0; i<N; i++){
            answer[i] = fails.get(i).stage;
        }
        
        return answer;
    }
}
