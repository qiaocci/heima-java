package cn.itcast.day11.demo03;

/*
一个类内部包含另一个类

分类:
1. 成员内部类
2. 局部内部类(包含匿名内部类)

成员内部类格式:
修饰符 class 外部类名称 {
    修饰符 class 内部类名称{

}
}

如何访问成员内部类:
1. 间接访问
2. 直接访问

 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        // 间接访问
        Body body = new Body();
        body.methodBody();

        // 直接访问
        Body.Heart heart = new Body().new Heart();
        heart.Beat();
    }

}
