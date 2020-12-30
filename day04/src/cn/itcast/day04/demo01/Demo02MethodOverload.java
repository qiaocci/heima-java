package cn.itcast.day04.demo01;

public class Demo02MethodOverload {
    public static void main(String[] args) {
        System.out.println(compare(1, 2));
        System.out.println(compare(true, true));
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(boolean a, boolean b){
        return a == b;
    }
}
