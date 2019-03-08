package com.classroom;

import java.util.Calendar;

public class DateDiff {
    public static class SecondMinuetHour {
        public int second;
        public int minute;
        public int hour;

        public SecondMinuetHour(int second, int minute, int hour) {
            this.second = second;
            this.minute = minute;
            this.hour = hour;
        }
    }

    public static SecondMinuetHour timeDiff(Calendar calendar1, Calendar calendar2) {
        long time1 = calendar1.getTime().getTime();
        long time2 = calendar2.getTime().getTime();
        System.out.println(time1);
        System.out.println(time2);
        long diff;
        if (time1 > time2)
            diff = time1 - time2;
        else if (time2 > time1)
            diff = time2 - time1;
        else {
            diff = 0;
            return new SecondMinuetHour(0, 0, 0);
        }
        int diffhours = (int) (diff / (60 * 60 * 1000));
        int diffmin = (int) (diff / (60 * 1000));
        int diffsec = (int) (diff / (1000));
        return new SecondMinuetHour(diffsec, diffmin, diffhours);
    }
}
