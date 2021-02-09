package cn.itcast.day11.demo04;

/*
局部内部类, 如果想访问方法局部变量, 这个局部变量必须是[有效final]的
也就是说, 这个变量不能变

原因:
1. new出来的对象在堆内存中
2. 局部变量跟着方法走, 在栈内存中
3. 方法结束后, 立即出栈, 局部变量会立刻消失
4. 但是new出来的方法, 会在堆中持续存在, 直到垃圾回收
 */

public class MyOuter {
    public void method() {
        int num = 10;
        class MyClass {
            public void methodInner() {
                System.out.println(num);
            }
        }
    }

}
