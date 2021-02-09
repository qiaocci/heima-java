在src目录下

1. 编译：
   javac com/imooc/demo01/Welcome.java
   
2. 打包：
   jar -cvf welcome.jar com/imooc/demo01/Welcome.class com/imooc/demo01/impl/Teacher.class
   
3. 运行出错， 解压查看：
   jar -xvf welcome.jar
   
4. 增加Main-Class
   Main-Class: com.imooc.demo01.Welcome
   
5. 重新打包
   jar -cvfm welcome.jar META-INF/MANIFEST.MF com/imooc/demo01/Welcome.class com/imooc/demo01/impl/Teacher.class
   
第二种方法：
1. 将编译后的.class文件，放在src/target目录下
   javac com/imooc/demo01/Welcome.java -d target
   
2. 将当前目录所有文件都打包到jar包中
jar -cvfm welcome.jar META-INF/MANIFEST.MF *