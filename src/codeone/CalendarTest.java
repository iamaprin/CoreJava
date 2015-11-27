/**
 * /codeone/CalendarTest.java
 * author: iamaprin
 * date: 2015/11/27
 * time: 10:26
 * description: print a calendar
 *                  -- a sample in the book
 */
package codeone;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarTest {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        GregorianCalendar d = new GregorianCalendar(2015, 11, 12);

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);
        d.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = d.get(Calendar.DAY_OF_WEEK);
        int firstDayOfWeek = d.getFirstDayOfWeek();
        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        String[] weekdayNmaes = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s", weekdayNmaes[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        } while (weekday != firstDayOfWeek);

        System.out.println();
        for (int i = 1; i <= indent; i++) {
            System.out.print("    ");   //%4s = %3s + "*" / " "
        }

        d.set(Calendar.DAY_OF_MONTH, 1);
        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);
            if (day == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
            //every a week, change a line
            if (weekday == firstDayOfWeek) {
                System.out.println();
            }
        } while (d.get(Calendar.MONTH) == month);

        if (weekday != firstDayOfWeek) {
            System.out.println();
        }
    }
}