package cn.itcast.day05.demo01;

import java.util.Arrays;

public class Demo05ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 9, 12};

        for (int min = 0, max = arr.length-1; min <= max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
