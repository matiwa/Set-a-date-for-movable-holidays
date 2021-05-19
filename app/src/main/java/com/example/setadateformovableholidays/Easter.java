package com.example.setadateformovableholidays;

public class Easter {
    private static int getA(int year)
    {
        if (year <= 1582)
        {
            return 15;
        }
        if (year <= 1699)
        {
            return 22;
        }
        if (year <= 1899)
        {
            return 23;
        }
        if (year <= 2199)
        {
            return 24;
        }
        if (year <= 2299)
        {
            return 25;
        }
        if (year <= 2399)
        {
            return 26;
        }
        if (year <= 2499)
        {
            return 25;
        }
        if (year <= 2599)
        {
            return 26;
        }
        if (year <= 2699)
        {
            return 27;
        }
        if (year <= 2899)
        {
            return 27;
        }
        if (year <= 2999)
        {
            return 28;
        }

        return 0;
    }

    private static int getB(int year)
    {
        if (year <= 1582)
        {
            return 6;
        }
        if (year <= 1699)
        {
            return 2;
        }
        if (year <= 1799)
        {
            return 3;
        }
        if (year <= 1899)
        {
            return 4;
        }
        if (year <= 2099)
        {
            return 5;
        }
        if (year <= 2199)
        {
            return 6;
        }
        if (year <= 2299)
        {
            return 0;
        }
        if (year <= 2499)
        {
            return 1;
        }
        if (year <= 2599)
        {
            return 2;
        }
        if (year <= 2699)
        {
            return 3;
        }
        if (year <= 2899)
        {
            return 4;
        }
        if (year <= 2999)
        {
            return 5;
        }

        return 0;
    }

    public static int easter(int year)
    {
        int a, b, c, d, e;

        a = year % 19;
        b = year % 4;
        c = year % 7;
        d = (a * 19 + getA(year)) % 30;
        e = (2 * b + 4 * c + 6 * d + getB(year)) % 7;
        if ((d == 29 && e == 6) ||
                (d == 28 && e == 6))
        {
            d -= 7;
        }
        return d + e;
    }

    private static boolean leap(int year)
    {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public int dataldk(int year){ //number of carnival days from 6I to 4II - 10III
        int dat;

        dat = 29 + easter(year);
        if(leap(year)) {
            dat=dat+1;
        }
        return dat;
    }

    public String datatc(int year) //-52days 29I-4III
    {
        int dat;
        int leaping=28;

        dat = 29 + easter(year);
        if(leap(year)){
            leaping=leaping+1;
            dat=dat+1;
        }
        if(dat>(31+leaping)){
            return dat%leaping+" March "+year;
        }
        else if(dat>31){
            return dat%31+" February "+year;
        }
        else{
            return dat+" January "+year;
        }
    }

    public String datao(int year) //-47days 3II-9III
    {
        int dat;
        int leaping=28;

        dat = 3 + easter(year);
        if(leap(year)) {
            leaping = leaping + 1;
            dat = dat + 1;
        }
        if (dat > leaping) {
            return dat % leaping + " March " + year;
        }
        else {
            return dat + " February " + year;
        }
    }

    public String datasp(int year) //-46days 4II-10III
    {
        int dat;
        int leaping=28;

        dat = 4 + easter(year);
        if(leap(year)) {
            leaping = leaping + 1;
            dat=dat+1;
        }
        if (dat > leaping) {
            return dat % leaping + " March " + year;
        } else {
            return dat + " February " + year;
        }
    }

    public String datanmp(int year) //-7days
    {
        int dat;

        dat = 15 + easter(year);
        if (dat > 31) {
            return dat % 31 + " April " + year;
        }
        else {
            return dat + " March " + year;
        }
    }

    public String data(int year)
    {
        int dat;

        dat = 22 + easter(year);
        if (dat > 31) {
            return dat % 31 + " April " + year;
        }
        else {
            return dat + " March " + year;
        }
    }

    public String databn(int year) //+7days
    {
        int dat;

        dat = 29 + easter(year);
        if(dat > 61) {
            return dat % 61 + " May " + year;
        }
        else if (dat > 31) {
            return dat % 31 + " April " + year;
        }
        else {
            return dat + " March " + year;
        }
    }

    public String datawp(int year) //+42days or +39days
    {
        int dat;
        int guideline;//date at the earliest from 2004 VII Easter Sunday (42 days), earlier 39 days (Thursday)
        if(year<2004) guideline=39;
        else guideline=42;

        dat = 22 + guideline + easter(year);
        if(dat > 92) {
            return dat % 92 + " June " + year;
        }
        else {
            return dat % 61 + " May " + year;
        }
    }

    public String datazsp(int year) //+49days
    {
        int dat;

        dat = 71 + easter(year);
        if(dat > 92) {
            return dat % 92 + " June " + year;
        }
        else {
            return dat % 61 + " May " + year;
        }
    }

    public String datanmpmk(int year) //+50days
    {
        int dat;

        dat = 72 + easter(year);
        if(dat > 92) {
            return dat % 92 + " June " + year;
        }
        else {
            return dat % 61 + " May " + year;
        }
    }

    public String datajcniwk(int year) //+53days
    {
        int dat;

        dat = 75 + easter(year);
        if(dat > 92) {
            return dat % 92 + " June " + year;
        }
        else {
            return dat % 61 + " May " + year;
        }
    }

    public String datatp(int year) //+56days
    {
        int dat;

        dat = 78 + easter(year);
        if(dat > 92) {
            return dat % 92 + " June " + year;
        }
        else {
            return dat % 61 + " May " + year;
        }
    }

    public String databc(int year) //+60days
    {
        int dat;

        dat = 82 + easter(year);
        if(dat > 92) {
            return dat % 92 + " June " + year;
        }
        else {
            return dat % 61 + " May " + year;
        }
    }

    public String datanspj(int year) { //+68days 29V-2VII
        int dat;

        dat = 90 + easter(year);
        if (dat > 122) {
            return dat % 122 + " July " + year;
        } else if (dat > 92) {
            return dat % 92 + " June " + year;
        } else {
            return dat % 61 + " May " + year;
        }
    }

    public String datansnmp(int year) { //+69days
        int dat;

        dat = 91 + easter(year);
        if (dat > 122) {
            return dat % 122 + " July " + year;
        } else if (dat > 92) {
            return dat % 92 + " June " + year;
        } else {
            return dat % 61 + " May " + year;
        }
    }
}
