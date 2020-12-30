package cn.itcast.day05.demo01;

import java.util.Arrays;

public class Demo01Array {
    public static void main(String[] args) {
        int[] colors = new int[3]; // 动态初始化
        String[] fruit = new String[]{"apple", "orange"}; // 静态初始化
        int[] months = {1, 2, 3, 4, 5, 6};  // 省略的静态初始化

        System.out.println(colors);
        System.out.println(colors[0]);
        System.out.println(colors.length);
        System.out.println(Arrays.toString(fruit));
    }
}
