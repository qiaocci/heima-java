package cn.itcase.day09.demo02;

public class Demo02ExtendFields {
    public static void main(String[] args) {
        Company c = new Company();
        c.name = "总公司";
        c.city = "上海";
        c.show();

        ByteDance bd = new ByteDance();
        bd.show();
        System.out.println(c.name);
        c.name = "字节跳动";
        System.out.println(c.name);

    }

}
