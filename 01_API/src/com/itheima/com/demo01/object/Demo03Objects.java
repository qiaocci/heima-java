package com.itheima.com.demo01.object;

import java.sql.SQLOutput;
import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "aBc";
//        System.out.println(s1.equals(s2)); // NullPointerException
        // null不能调用方法，否则会出现空指针异常

        /*
        Objects.equals ：比较对象，防止空指针异常
        public static boolean deepEquals(Object a, Object b) {
                if (a == b)
                    return true;
                else if (a == null || b == null)
                    return false;
                else
                    return Arrays.deepEquals0(a, b);
            }
         */
        System.out.println(Objects.equals(s1, s2));
    }


}
