package cn.itcast.generic;

import java.util.ArrayList;
/*

泛型是一种位置的数据类型，当我们不知道使用什么数据类型的时候，可以使用泛型
泛型也可以看做一个变量，用来接收数据类型
    E e: Element 元素
    T t: Type 类型

ArrayList类型在定义的时候，不知道集合会存储什么类型的数据，所以类型使用泛型
E: 未知的数据类型
public class ArrayList<E> {
    public boolean add(E e) {}
    public E get(int index) {}
}

创建对象的时候，会确定泛型的类型

ArrayList<Student> std = new ArrayList<>();

 */

public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("tom");
        names.add("jerry");
        names.add("linda");
        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }
    }

}
