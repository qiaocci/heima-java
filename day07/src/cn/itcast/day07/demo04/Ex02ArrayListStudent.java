package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
自定义4个学生对象,添加到集合,并遍历
 */
public class Ex02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> stds = new ArrayList<>();

        Student std1 = new Student("Tom", 1);
        stds.add(std1);
        stds.add(new Student("Jerry", 2));
        System.out.println(stds);

        for (Student s : stds) {
            System.out.println(s);
        }
    }
}
