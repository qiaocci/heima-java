package cn.itcase.day10.demo01;
/*
注意：
不能通过实现类的对象， 调用接口的静态方法
通过接口名，直接调用静态方法
格式：
接口名.静态方法();
 */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
//        impl.methodStatic(); // 错误写法

        MyInterfaceStatic.methodStatic();


    }

}
