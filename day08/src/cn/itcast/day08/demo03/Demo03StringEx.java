package cn.itcast.day08.demo03;

/*
题目：
定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。

分析：
1. 首先准备一个int[]数组，内容是：1、2、3
2. 定义一个方法，用来将数组变成字符串
三要素
返回值类型：String
方法名称：fromArrayToString
参数列表：int[]
3. 格式：[word1#word2#word3]
用到：for循环、字符串拼接、每个数组元素之前都有一个word字样、分隔使用的是#、区分一下是不是最后一个
4. 调用方法，得到返回值，并打印结果字符串
 */
public class Demo03StringEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        String base = "word";
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                res += base + arr[i] + "#";
            } else {
                res += base + arr[i] + "]";
            }
        }

        return res;

    }

}
