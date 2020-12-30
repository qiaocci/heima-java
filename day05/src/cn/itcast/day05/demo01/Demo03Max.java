package cn.itcast.day05.demo01;

public class Demo03Max {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 7, 2};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
