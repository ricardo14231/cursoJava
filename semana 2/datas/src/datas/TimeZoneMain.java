package datas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneMain {

	public static void main(String[] args) {
		Calendar euroCal = new GregorianCalendar(TimeZone.getTimeZone("Erope/Tiraspol"));
		System.out.println(euroCal.HOUR);
	}
	
}
