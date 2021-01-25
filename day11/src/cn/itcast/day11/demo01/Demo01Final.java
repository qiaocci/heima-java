package cn.itcast.day11.demo01;

/*
final代表最终的、不可改变的意思

用法：
1. 修饰类
2. 修饰方法
3. 修饰局部变量
4. 修饰成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        // final修饰局部变量,不可变
        final int num = 1;
//        num = 100;

        // 对于基本数据类型,不可变指的是数据不可变
        // 对于引用数据类型,不可变指的是变量当中的地址值不可变
        final Student std = new Student();
        std.setName("qiaocc");
        std.setName("qiaocccc");
        std.getName();
    }
}
