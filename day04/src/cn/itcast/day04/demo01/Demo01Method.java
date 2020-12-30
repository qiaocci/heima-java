package cn.itcast.day04.demo01;

public class Demo01Method {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
        System.out.println(isSame(1,2));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static boolean isSame(int a, int b) {
        return a == b;
    }

}
