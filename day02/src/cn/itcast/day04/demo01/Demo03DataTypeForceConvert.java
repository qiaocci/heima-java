package cn.itcast.day04.demo01;

public class Demo03DataTypeForceConvert {
    public static void main(String[] args) {
        int i = (int) 1.5; // 强制类型转换
        System.out.println(i);

        short s = 1;
        int i2 = 1000;
        short res = (short) (s + i2);
        System.out.println(res);

        char a = 'a'; // 字符类型，居然可以加0！
        System.out.println(a + 0);
    }

}
