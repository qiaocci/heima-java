package cn.itcast.day08.demo05;

import java.util.Arrays;

/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysEx {
    public static void main(String[] args) {
        String str = "ajlkjdashfkahd";
        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        System.out.println(arr);

        for (int i = arr.length -1; i >0; i--) {
            System.out.println(arr[i]);
        }
    }

}
