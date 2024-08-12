package com.java.variable;

/**
 * @Author Wayne Ming
 * @Date 2024/8/12
 */
public class VariableTest {
    public static void main(String[] args) {
        // 定义变量的方式1：
        char gender;
        gender = 'M';
        gender = 'W';

        // 定义变量的方式2：声明和初始化合并
        int age = 10;

        System.out.println("age = " + age);
        System.out.println("gender = " + gender);

        // 在同一个作用域内，不能声明两个同名的变量
        // char gender = '男';

        // Java中每个变量必须先声明，后使用。
        // number = 100

        // 超出byte类型范围，编译不通过。
        // byte b1 = 128;
        byte b2 = 127;
    }

    public static void main123() {
        // 变量只有在其作用域内才有效。出了作用域，变量不可以再被调用。
        char gender = 'a';
    }
}
