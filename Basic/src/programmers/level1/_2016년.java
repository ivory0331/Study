package programmers.level1;

public class _2016년 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		String answer = "";
        int month[] = {31,29,31,30,31,30,31,31,30,31,30,31}; // 1월부터 12월까지의 날짜 수
        
        for(int i=0; i<a-1; i++){ //a=5
            b += month[i]; // 31+29+31+30 +24
        }
        switch ((b-1)%7) {
		case 0: answer = "FRI";
			break;
        case 1: answer = "SAT";
			break;
        case 2: answer = "SUN";
			break;
        case 3: answer = "MON";
			break;
        case 4: answer = "TUE";
			break;
        case 5: answer = "WED";
			break;
        case 6: answer = "THU";
			break;
		}
        
        System.out.println(answer);

	}

}
