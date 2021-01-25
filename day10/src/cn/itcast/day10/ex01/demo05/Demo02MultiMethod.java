package cn.itcast.day10.ex01.demo05;

/*
成员方法运行规则:
口诀: 编译看左边, 运行看右边.

成员变量:
口诀: 编译运行都看左边
 */

public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
//        obj.methodZi(); // 错误写法
    }
}
