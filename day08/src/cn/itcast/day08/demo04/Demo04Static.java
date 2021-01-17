package cn.itcast.day08.demo04;
/*
静态代码块: 当第一次用到本类时, 执行唯一的一次
静态内容优先于非静态, 所以静态静态代码块比构造方法先执行
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }

}
