package cn.itcase.day10.demo01;

/*
在任何版本中，都可以定义抽象方法
格式：
public abstract 返回值 方法名();

注意：
1. 在接口里，抽象方法必须使用关键字public abstract
2. 这两个关键字也可以省略掉
3. 方法三要素，可以随意定义（方法名，参数，返回值）
 */
public interface MyInterfaceAbstract {

    // 这些都是抽象方法
    public abstract void methodAbs1();

    abstract void methodAbs2();

    public void methodAbs3();

    void methodAbs4();
}
