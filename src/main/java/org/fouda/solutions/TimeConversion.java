package org.fouda.solutions;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM").equalsIgnoreCase("19:05:45"));
        System.out.println(timeConversion("12:00:00AM").equalsIgnoreCase("00:00:00"));
        System.out.println((timeConversion("12:00:00AM")));
        /*
            Symbol  Meaning                     Presentation      Examples
            ------  ------------                ------------      --------
            a       am-pm-of-day                text              PM
            h       clock-hour-of-am-pm (1-12)  number            12
            K       hour-of-am-pm (0-11)        number            0
            k       clock-hour-of-am-pm (1-24)  number            0
            H       hour-of-day (0-23)          number            0
        */
    }
}
