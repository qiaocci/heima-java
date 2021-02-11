package cn.itcast.generic;

/*
定义含有泛型的方法
格式：
    修饰符 <泛型> 返回值类型 方法名(参数列表（使用泛型）){}
 */
public class GenericMethod {
    public <M> void method01(M m) {
        System.out.println(m);
    }

    // 静态方法
    public static <S> void method02(S s) {
        System.out.println(s);
    }

}
