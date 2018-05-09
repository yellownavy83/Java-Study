package programmers.level2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//2016년 1월 1일은 금요일입니다. 2016년 A월 B일은 무슨 요일일까요?
//두 수 A,B를 입력받아 A월 B일이 무슨 요일인지 출력하는 getDayName 함수를 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각
//SUN,MON,TUE,WED,THU,FRI,SAT
//를 출력해주면 됩니다. 예를 들어 A=5, B=24가 입력된다면 5월 24일은 화요일이므로 TUE를 반환하면 됩니다.

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
