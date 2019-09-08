package org.westos.demo2;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.lang.reflect.Constructor;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-08-02 09:55
 * @Description:西部开源教育科技有限公司
 */
public class MyTest2 {
    public static void main(String[] args) throws Exception{
        //以前我们创建对象的方式
       // Student student = new Student();
        //通过方式的方式，来创建该类的对象
        Class<?> clazz = Class.forName("org.westos.demo2.Student");
        //获取空参的构造方法对象
        Constructor<?> constructor = clazz.getConstructor();
        //通过构造方法对象中的newInstance()方法，创建该类对象
        Student o = (Student) constructor.newInstance();
        System.out.println(o);
        System.out.println("------------------------");
        //通过有参构造来创建该类的对象
       //Student zhangsan = new Student("zhangsan", 23);
        //通过反射的方式
        Constructor<?> constructor1 = clazz.getConstructor(String.class, int.class);
        Object obj = constructor1.newInstance("lisi", 24);
        System.out.println(obj);
    }
}
