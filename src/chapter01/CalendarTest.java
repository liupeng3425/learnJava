package chapter01;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Peng on 2016/1/27.
 * Using calendar.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DATE);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}

