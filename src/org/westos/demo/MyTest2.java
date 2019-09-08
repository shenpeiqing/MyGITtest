package org.westos.demo;

import java.sql.SQLOutput;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 09:24
 * @Description:西部开源教育科技有限公司
 */
public class MyTest2 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取一个类的字节码文件对象的方式3
        //全路径：一个类带有包名  全类名：带有包名的类
        Class<?> aClass = Class.forName("org.westos.demo.Student");

        //Ctrl+alt+空格 提示
        Class<?> aClass2 = Class.forName("org.westos.demo.Student");

        System.out.println(aClass==aClass2);
    }
}
