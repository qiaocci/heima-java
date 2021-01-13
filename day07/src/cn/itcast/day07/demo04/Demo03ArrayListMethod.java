package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
public boolean add(E e) ：将指定的元素添加到此集合的尾部。
public E remove(int index) ：移除此集合中指定位置上的元素。返回被删除的元素。
public E get(int index) ：返回此集合中指定位置上的元素。返回获取的元素。
public int size() ：返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> personList = new ArrayList<>();

        personList.add("小s");
        personList.add("蔡康永");
        personList.add("陈汉典"); // 增加
        System.out.println(personList);

        String p1 = personList.get(0); // 获取
        System.out.println(p1);

        System.out.println(personList);
        personList.remove(2); // 删除
        System.out.println(personList);

        System.out.println(personList.size()); // 计算大小
    }

}
