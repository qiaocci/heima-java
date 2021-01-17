package cn.itcast.day08.demo03;

/*
分割字符串的方法：
public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

注意事项：
split方法的参数其实是一个“正则表达式”，今后学习。
今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）
 */
public class Demo02StringSplit {
    public static void main(String[] args) {
        String word = "hello qiaocc";
        String[] stringArray = word.split("o"); // 分割。注意转义
        for (String arr : stringArray) {
            System.out.println(arr);
        }
    }

}
