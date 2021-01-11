package cn.itcast.day06.demo03;

public class Demo02Method {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

}
