package cn.itcase.day10.demo01;

/*
从Java 8开始，接口里允许定义默认方法。
格式：
public default 返回值类型 方法名称(参数列表) {
    方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题。
 */
public interface MyInterfaceDefault {

    public abstract void methodAbs();

//    public abstract void methodAbs2();

    public default void methodDefault() {
        System.out.println("接口的默认方法");
    }


}
