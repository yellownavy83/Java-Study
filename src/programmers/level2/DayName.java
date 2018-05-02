package programmers.level2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayName {

    private String getDayName(int a, int b) {
        String[] days = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        String month = a < 10 ? "0" + Integer.toString(a) : Integer.toString(a);
        String day = b < 10 ? "0" + Integer.toString(b) : Integer.toString(b);
        String input = "2016" + month + day;

        int dayNum = 0;
        try {
            Date date = format.parse(input);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            dayNum = cal.get(Calendar.DAY_OF_WEEK);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return days[dayNum - 1];
    }

    public static void main(String[] args) {
        DayName dayName = new DayName();
        int a=5, b=24;
        System.out.println(dayName.getDayName(a,b));
    }
}
