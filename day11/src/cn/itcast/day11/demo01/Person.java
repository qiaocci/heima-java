package cn.itcast.day11.demo01;
/*
final修饰成员变量

注意:
1. 由于成员变量具有默认值,使用final修饰后,必须手动赋值.
2. 要么直接赋值,要么在构造方法中赋值
3. 如果使用构造方法赋值,必须保证所有构造方法都赋值
 */
public class Person {
    private final String name/* = "qiaocc"*/;

    public Person() {
        this.name = "qiaocc";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
