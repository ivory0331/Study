package test;

import java.text.*;
import java.util.*;

public class C_solution2 {
	
	public static void main(String[] args) throws ParseException {
		int n = 3; 
		String[] customers = {"10/01 23:20:25 30",
							  "10/01 23:25:50 26",
							  "10/01 23:31:00 05",
							  "10/01 23:33:17 24",
							  "10/01 23:50:25 13",
							  "10/01 23:55:45 20",
							  "10/01 23:59:39 03",
							  "10/02 00:10:00 10"};
		int answer = 0;
		HashMap<Integer, String> map = new HashMap<>();
		for(int i=1; i<=n; i++) {
			map.put(i, "01/01 00:00:00");
		}
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd HH:mm:SS");
		Calendar cal = Calendar.getInstance();
		
		for(int i=0; i<customers.length; i++) {
			int s = Integer.parseInt(customers[i].substring(15)); // �ҿ�ð�
			Date date = sdf.parse(customers[i].substring(0,15)); // �� �����ð�
			
			for(int k=1; k<=n; k++) {
				Date mDate = sdf.parse(map.get(k)); // Ű����ũ � �Ϸ� �ð�
				if(mDate.equals(date) || mDate.after(date)) { // Ű����ũ �ð��� ���ų� �� �����̶��
					cal.setTime(date);
					cal.add(Calendar.MINUTE, s);
					map.put(k, sdf.format(cal.getTime()));
					
					break;
				}else { // ����ִ°� ���� ���
					
				}
			}
			
		}
		
		
		
		
		
	}

}
