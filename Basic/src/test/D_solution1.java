package test;

import java.text.*;
import java.util.*;

public class D_solution1 {

	public static void main(String[] args) throws ParseException {
		String p = "AM 12:01:00";
		int n = 1;
		String answer = null;
		
		String when = p.substring(0, 2);
		String time = p.substring(3);
		
		String excep = time.substring(0,2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date date = sdf.parse(time);
		cal.setTime(date);
		
		if("PM".equals(when)) {
			if(!"12".equals(excep)) {
				cal.add(Calendar.HOUR, 12);
			}
		} else if("12".equals(excep) && "AM".equals(when)) {
			cal.add(Calendar.HOUR, 12);
		}
		cal.add(Calendar.SECOND, n);
		
		answer = sdf.format(cal.getTime());
		System.out.println(answer);
	}

}
