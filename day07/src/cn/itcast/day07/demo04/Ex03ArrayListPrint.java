package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
格式参照 {元素@元素@元素}。

System.out.println(list);       [10, 20, 30]
printArrayList(list);           {10@20@30}
 */
public class Ex03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> als = new ArrayList<>();
        als.add("tom");
        als.add("jerry");
        als.add("mary");
        printArrayList(als);
    }

    public static void printArrayList(ArrayList<String> als) {
        System.out.print("{");
        for (int i = 0; i < als.size(); i++) {
            if (i != als.size() - 1) {
                System.out.print(als.get(i) + "@");
            }else{
                System.out.print(als.get(i));
            }
        }
        System.out.print("}");
    }

}
