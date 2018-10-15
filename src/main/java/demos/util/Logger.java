package demos.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Logger {
	public static void log(String s) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy HH:mm:ss.SSS");
		formatter.setTimeZone(TimeZone.getDefault());
		String date = formatter.format(new Date());
		
		String prepend = date + " [" + Thread.currentThread().getName() 
							+ "-" + Thread.currentThread().getId() + "]: "; 
		System.out.println(prepend + s);
	}
}
