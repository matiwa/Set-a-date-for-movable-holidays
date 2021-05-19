package com.example.setadateformovableholidays;

public class Day {

    public static String week[] =
            {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static int numberOfDays[] =
            {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public static boolean leap(int year) {
        return ((year % 4 == 0  &&  year % 100 != 0) || year % 400 == 0);
    }

    public static int dayOfWeek(int day, int month, int year) {
        int dayOfYear;
        int yy, c, g;
        int result;

        dayOfYear = day + numberOfDays[month-1];
        if ((month > 2) && (leap(year) == true))
            dayOfYear++;

        yy = (year - 1) % 100;
        c = (year - 1) - yy;
        g = yy + (yy / 4);
        result = (((((c / 100) % 4) * 5) + g) % 7);
        result += dayOfYear - 1;
        result %= 7;

        return result;
    }
}
