package cn.itcast.day05.demo01;

public class Demo06PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr);

        String[] colors = {"black", "red", "green"};
        printArray(colors);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }

    public static void printArray(String[] arr) {
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
