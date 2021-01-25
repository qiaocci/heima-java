package cn.lxf.demo01;

import javax.lang.model.element.Name;

public class Student implements Person {
    private String name;

    public Student() {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
