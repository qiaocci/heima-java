package cn.itcase.day09.demo04;

/*
局部变量：         直接写成员变量名
本类的成员变量：    this.成员变量名
父类的成员变量：    super.成员变量名
 */
public class ByteDance extends Company {
    String name;
    double rank;
    int num = 20;

    public void show() {
        System.out.println("子类方法执行");
    }


}
