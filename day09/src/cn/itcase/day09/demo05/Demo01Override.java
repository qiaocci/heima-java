package cn.itcase.day09.demo05;

/*
方法覆盖(override):
1.方法名相同,参数也相同

@Override 写在方法前, 检测是否是有效的覆盖
这个注解就算不写,也算是覆盖重写

2. 子类方法的返回值,必须小于等于父类返回值的范围
Object是父类, String是子类

3. 子类方法的权限,必须大于等于父类的权限.
public > protected > default > private
备注: default不是关键字,而是什么都不写
 */
public class Demo01Override {
    public static void main(String[] args) {

    }

}
