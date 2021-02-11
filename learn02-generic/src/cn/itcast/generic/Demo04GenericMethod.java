package cn.itcast.generic;

public class Demo04GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();

        // 调用含有泛型的方法，传递什么类型，泛型就是什么类型
        gm.method01("a");
        gm.method01(1);
        gm.method01(true);

        // 静态方法，不建议使用对象调用。建议使用类调用
        GenericMethod.method02(1);
    }

}
