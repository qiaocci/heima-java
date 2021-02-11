package cn.itcast.generic;


/*
含有泛型的接口，第一种方式： 定义接口的实现类，实现接口，指定接口类型
接口：
public interface Iterator<E> {}

实现类
public final class Scanner implements Iterator<String> {
        public String next() {}
}

 */
public class GenericInterfaceImpl implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
