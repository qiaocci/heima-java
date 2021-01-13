package cn.itcast.day07.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class Demo02Date {
    public static void main(String[] args)  {
        // 时间格式化
        Date d = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(fmt.format(d));

        // 字符串转日期格式
        String input = "2021-01-13 11:06:05";
        Date dt;
        try {
            dt = fmt.parse(input);
            System.out.println(dt);
        } catch (ParseException e) {
            System.out.println("不能解析" + input);
        }

        // 时间间隔

        try {
            long start = System.currentTimeMillis();
            System.out.println(start);
            Thread.sleep(1000 * 3);
            long end = System.currentTimeMillis();
            System.out.println(end);
            long cost = end - start;
            System.out.println("cost=" + cost);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
