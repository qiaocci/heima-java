package cn.itcast.day06.demo01;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        // 面向过程，每个细节都亲力亲为
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        // 面向对象
        System.out.println(Arrays.toString(arr));
    }
}
