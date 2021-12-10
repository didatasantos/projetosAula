package date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateManipulation2 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // puxa o formato
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance(); // posteriomente puxa o calendário
		cal.setTime(d); // joga na classe setTime
		Date x1 = new Date();
		cal.setTime(x1);
	System.out.println(cal.get(Calendar.MONTH) + " mine"); // chama o que deseja com cal.get!
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
