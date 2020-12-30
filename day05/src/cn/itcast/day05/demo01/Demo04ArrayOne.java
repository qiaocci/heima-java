package cn.itcast.day05.demo01;

public class Demo04ArrayOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr);

        arr[0] = 10;
        System.out.println(arr); // 地址值不变
    }

}
