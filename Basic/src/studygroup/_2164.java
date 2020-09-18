package studygroup;

import java.util.*;

public class _2164 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 6
		LinkedList<Integer> card = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			card.add(i);
		}
		// 1 2 3 4 5 6
		while (card.size() != 1) {
			card.remove(0);
			card.add(card.get(0));
			card.remove(0);
        }
		System.out.println(card.get(0));
		scan.close();
	}
}