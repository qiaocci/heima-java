package cn.itcast.day08.demo04;

public class MyClass {
    int num;
    static int numStatic;

    // 成员方法
    public void method() {
        System.out.println("成员方法");
        System.out.println(num);
        System.out.println(numStatic);
    }
// 静态方法
    public static void methodStatic() {
        System.out.println("静态方法");
        System.out.println(numStatic);
//        System.out.println(num); 静态不能访问非静态[重要]
    }

}
