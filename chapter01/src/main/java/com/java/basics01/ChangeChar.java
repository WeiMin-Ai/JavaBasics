package com.java.basics01;// 演示转义字符的使用

public class ChangeChar {
    public static void main(String[] args) {
        // \t：制表符号，实现对其功能
        System.out.println("北京\t上海\t广州");
        // \n：换行符
        System.out.println("北京\n上海\n广州");
        // \：改变转义的功能
        System.out.println("北京\"上海\"广州");
        System.out.println("北京\'上海\'广州");
        // \r：一个回车
        System.out.println("韩顺平教育\r北京");
    }
}
