package cn.itcast.day10.ex01.demo05;

/*
访问成员变量：
1. 直接通过对象名访问成员变量：看等号左边是谁，优先用谁，没有则向上找
2. 间接通过成员方法访问成员变量： 看该方法属于谁，优先用谁，没有则向上找
 */
public class Demo01MultiField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num); // 直接访问

        // 间接访问
        // 子类没有就用父类
        // 子类有就用子类
        obj.showNum();
    }

}
