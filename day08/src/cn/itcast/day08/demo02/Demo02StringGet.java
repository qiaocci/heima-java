package cn.itcast.day08.demo02;

public class Demo02StringGet {
    public static void main(String[] args) {
        String word = "hello qiaocc";
        System.out.println(word.length()); // 长度

        String word2 = ", good morning";
        String word3 = word.concat(word2); // 拼接
        System.out.println(word3);

        System.out.println(word.charAt(4));// 根据索引获取字符
//        System.out.println(word.charAt(-1));// StringIndexOutOfBoundsException
        System.out.println(word.indexOf("llo")); // 获取索引
    }

}
