package cn.itcast.day08.demo03;

/*
String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
备注：CharSequence意思就是说可以接受字符串类型。
 */
public class Demo01StringConvert {
    public static void main(String[] args) {
        String word = "hello qiaocc";
        char[] charArray = word.toCharArray();
        System.out.println(charArray[0]);

        byte[] byteArray = word.getBytes(); //
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }

        char c = 'h'; // 字符转ascii
        int ascii = (int) c;
        System.out.println(ascii);

        System.out.println(word.replace('l', 'x')); // 替换
        System.out.println(word.replace("llo", "abc")); // 替换
    }
}
