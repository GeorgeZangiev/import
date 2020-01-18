package ypok48;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Time {

	public static void main(String[] args) throws Throwable {
		Date date = new Date ();
		System.out.println(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.WEEK_OF_MONTH, 1);
		System.out.println(calendar.getTime());
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dateFormat.format(calendar.getTime()));
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		Date newDate = simpleDateFormat.parse("12/11/2007");
		System.out.println(newDate);
		}

}
