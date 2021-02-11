package cn.itcast.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02Generic {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /*
    使用泛型
    优点：
        1. 避免类型转换
        2. 运行期异常（代码运行后，才会抛出的异常），提升到了编译期（写代码的时候就会报错）
    缺点：
        泛型是什么类型，就只能存储什么类型


     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jerry");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s + ", " + s.length());
        }

    }

    /*
    创建集合对象，不使用泛型
    优点：不使用泛型，默认就是Object类型，可以存储任意类型的数据
    缺点：不安全，会引发异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("tom");
        list.add(1);

        // 迭代
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);

            // 调用字符串特有的方法
            // 父类使用子类的方法，需要强制类型转换（多态）
            String s = (String) obj;
            System.out.println(s.length()); // 报错 ClassCastException

        }


    }

}
