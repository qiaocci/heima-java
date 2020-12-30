package cn.itcast.day04.demo01;

public class Demo04Add {
    public static void main(String[] args) {
        // 自增：单独使用，正常
        int i = 1;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);

        i = 1;
        // 混合使用
        // 前++：先加后用
        // 后++：先用后加
        System.out.println(++i);
        System.out.println(i++);
    }

}
