package cn.itcast.day04.demo01;

public class Demo02DataTypeConvert {
    public static void main(String[] args) {
        byte b = 1;
        int i = 2;
        int res1 = b + i; // 类型转换，转成取值范围大的类型，自动转换
        System.out.println(res1);

        int i2 = 2;
        double d = 2.1;
        double res2 = i2+ d;
        System.out.println(res2);
    }
}
