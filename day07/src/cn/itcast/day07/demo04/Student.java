package cn.itcast.day07.demo04;

public class Student {
    String name;
    int order;

    public Student() {
    }

    ;

    public Student(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

}
