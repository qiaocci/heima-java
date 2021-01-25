package cn.itcast.day11.demo01;

/*
final 修饰方法

注意:
abstract和final不能共存
 */
public abstract class Fu {
    public void method() {
        System.out.println("父类方法");
    }

    public abstract /*final*/ void methodAbstract();
}
