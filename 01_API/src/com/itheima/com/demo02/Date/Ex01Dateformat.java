package com.itheima.com.demo02.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01Dateformat {
    public static void main(String[] args) throws ParseException {
        demo01();
    }

    private static void demo01() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date birthdate = sdf.parse("1992-06-04 00:00:00");
        System.out.println(birthdate);
        long sinceBirth = new Date().getTime() - birthdate.getTime();
        System.out.println(sinceBirth/1000/ 3600/ 24/ 365);

    }

}
